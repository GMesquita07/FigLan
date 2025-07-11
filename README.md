# FigLan
Repositório do trabalho em recurso de Compiladores


Plano de Trabalho por Etapas

🧩 Fase 1 — Análise da Gramática e Parser

Especificar a gramática da linguagem FigLan em ANTLR (tipos, instruções, expressões, etc.)

    Gerar o parser e visitor base

🧠 Fase 2 — Análise Semântica

Implementar análise de tipos (com verificação de declarações, atribuições, compatibilidades)

    Suporte para escopos e ambiente de símbolos

🛠️ Fase 3 — Geração de Código com StringTemplate

Definir templates base (e.g., para variáveis, expressões, comandos)

    Traduzir as construções da linguagem para chamadas Java (board.draw(...), etc.)

🎨 Fase 4 — Integração com Código Java Gráfico

Garantir que o código gerado usa as classes Figure, FigureBoard, etc.

    Gerar main() com ciclo de execução compatível

🧪 Fase 5 — Testes e Validação

Validar os exemplos fornecidos (example1.fl, etc.)

Testar casos limite e erro semântico

    Desafio extra: "cara a piscar os olhos" com animação

⚙️ Proposta de Estrutura Técnica

    Figlan.g4: gramática ANTLR

    SymbolTable.java: análise semântica

    FiglanCompiler.java: main + coordenação de fases

    templates/: ficheiros .stg do StringTemplate

    output/: código Java gerado a partir dos .fl