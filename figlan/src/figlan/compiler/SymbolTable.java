package figlan.compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {

    private final Stack<Map<String, Symbol>> stack = new Stack<>();

    // O construtor já cria o escopo global.
    public SymbolTable() {
        enterScope(); // Inicia com o escopo global na pilha
    }

    // Entra num novo escopo
    public void enterScope() {
        stack.push(new HashMap<>());
    }

    // Sai do escopo atual
    public void exitScope() {
        stack.pop();
    }

    // Adiciona um novo símbolo ao escopo atual (no topo da pilha)
    public boolean put(String name, Symbol symbol) {
        Map<String, Symbol> currentScope = stack.peek();
        if (currentScope.containsKey(name)) {
            // Erro: Variável já declarada neste escopo!
            return false;
        }
        currentScope.put(name, symbol);
        return true;
    }

    // Procura por um símbolo em todos os escopos, de dentro para fora
    public Symbol get(String name) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            Map<String, Symbol> scope = stack.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        // Não encontrou em nenhum escopo
        return null;
    }

    // Opcional: verifica se um símbolo existe apenas no escopo atual
    public boolean probe(String name) {
        return stack.peek().containsKey(name);
    }
}
