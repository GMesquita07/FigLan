# Compilador FigLan

Este repositório contém o código-fonte de um compilador para a linguagem FigLan, desenvolvida no âmbito da unidade curricular de Compiladores.

O compilador traduz código-fonte Figlan (`.fl`) para código Java executável que utiliza uma biblioteca gráfica para desenhar figuras geométricas.

## Estrutura de Pastas

* `figlan/examples/`: Contém ficheiros de exemplo com código-fonte Figlan.
* `figlan/java-test/`: Contém a biblioteca de runtime Java para a GUI e as classes base das figuras.
* `figlan/lib/`: Contém as dependências `.jar` (ANTLR e StringTemplate).
* `figlan/src/figlan/`: Contém o código-fonte do seu compilador, seguindo a convenção de pacotes Java.
    * `compiler/`: O código do compilador (`Main`, `CodeGenerator`, etc.). O pacote é `figlan.compiler`.
    * `grammar/`: O ficheiro da gramática ANTLR (`.g4`).
    * `generated/`: **(Pasta Gerada)** Onde o ANTLR colocará o Parser e o Lexer. O pacote será `figlan.generated`.
* `figlan/bin/`: **(Pasta Gerada)** Onde o `javac` colocará todos os ficheiros `.class` compilados.

---

## Instruções de Compilação e Execução

Todos os comandos devem ser executados a partir da pasta raiz do repositório (`FigLan/`).

### Passo 0: Pré-requisitos

Certifique-se de que tem o Java JDK instalado. Antes de compilar pela primeira vez, crie a pasta `bin`:

```bash
mkdir figlan/bin
```

### Passo 1: Gerar o Parser a partir da Gramática

Este comando invoca a ferramenta ANTLR para gerar os ficheiros Java do parser, lexer e visitor a partir da gramática `Figlan.g4`.

```bash
java -jar figlan/lib/antlr-4.13.1-complete.jar -o figlan/src/figlan/generated -package figlan.generated -visitor -no-listener figlan/src/figlan/grammar/Figlan.g4
```

**Explicação dos parâmetros:**
* `-o figlan/src/figlan/generated`: Define o diretório de saída correto.
* `-package figlan.generated`: Especifica o nome completo do pacote para os ficheiros gerados.
* `-visitor`: Gera as classes base para o padrão de projeto Visitor.
* `-no-listener`: Opcional, para não gerar as classes do padrão Listener.

### Passo 2: Compilar Todo o Código-Fonte Java

Compilamos o nosso código do compilador, a biblioteca de figuras e os ficheiros gerados pelo ANTLR.

```bash
# Para Linux/macOS
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" $(find figlan/src -name "*.java") $(find figlan/java-test -name "*.java")

# Para Windows (note o ponto e vírgula ';' no classpath)
# javac -d figlan\bin -cp "figlan\lib\antlr-4.13.1-complete.jar;figlan\lib\ST-4.3.4.jar" @sources.txt
# (Onde sources.txt é um ficheiro com a lista de todos os .java a compilar)
```

### Passo 3: Executar o Compilador (Figlan -> Java)

Usamos o nosso compilador para traduzir um ficheiro de exemplo.

```bash
# Para Linux/macOS
java -cp "figlan/bin:figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" figlan.compiler.Main figlan/examples/example1.fl

# Para Windows
# java -cp "figlan\bin;figlan\lib\antlr-4.13.1-complete.jar;figlan\lib\ST-4.3.4.jar" figlan.compiler.Main figlan\examples\example1.fl
```
Após a execução, um novo ficheiro, `FiglanProgram.java`, será criado na pasta `figlan/`.

### Passo 4: Compilar o Programa Gerado

Compilamos o `FiglanProgram.java` que o nosso compilador acabou de criar.

```bash
javac -d figlan/bin -cp figlan/bin figlan/FiglanProgram.java
```

### Passo 5: Executar o Programa Final

Finalmente, executamos o programa e vemos o resultado gráfico.

```bash
java -cp figlan/bin generated.FiglanProgram
```

---

### Limpeza

Para limpar todos os ficheiros gerados e começar do zero, pode executar os seguintes comandos:

```bash
rm -rf figlan/bin/*
rm -rf figlan/src/figlan/generated/*
rm -f figlan/FiglanProgram.java
```
