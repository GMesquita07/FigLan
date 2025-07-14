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
      * `generated/`: **(Pasta Gerada)** Onde o ANTLR e o seu compilador colocarão os ficheiros Java gerados. O pacote será `figlan.generated`.
  * `figlan/bin/`: **(Pasta Gerada)** Onde o `javac` colocará todos os ficheiros `.class` compilados.

-----

## Instruções de Compilação e Execução

Para garantir uma compilação limpa, é recomendado executar os comandos de limpeza antes de começar. Todos os comandos seguintes devem ser executados a partir da pasta raiz do repositório (`FigLan/`).

### Passo 0: Pré-requisitos

Certifique-se de que tem o Java JDK instalado. Antes de compilar pela primeira vez, crie a pasta `bin`:

```bash
mkdir figlan/bin
```

### Passo 1: Gerar o Parser a partir da Gramática

Este passo invoca a ferramenta ANTLR. Para evitar a criação de pastas aninhadas indesejadas, o comando muda temporariamente para o diretório da gramática.

```bash
cd figlan/src/figlan/grammar
java -jar ../../../lib/antlr-4.13.1-complete.jar -o ../generated -package figlan.generated -visitor -no-listener Figlan.g4
cd ../../../../
```

**Explicação dos parâmetros:**

  * `-o ../generated`: Define o diretório de saída (`figlan/src/figlan/generated`).
  * `-package figlan.generated`: Especifica o nome do pacote para os ficheiros gerados.
  * `-visitor`: Gera as classes base para o padrão de projeto Visitor.
  * `-no-listener`: Opcional, para não gerar as classes do padrão Listener.

### Passo 2: Compilar o Código-Fonte do Compilador

Compilamos o nosso código, a biblioteca de figuras e os ficheiros gerados pelo ANTLR para preparar o compilador para ser executado.

```bash
# Para Linux/macOS
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" $(find figlan/src -name "*.java") $(find figlan/java-test -name "*.java")
```

### Passo 3: Executar o Compilador (Figlan -\> Java)

Usamos o nosso compilador para traduzir um ficheiro de exemplo. Após a execução, um novo ficheiro, `FiglanProgram.java`, será criado na pasta `figlan/src/figlan/generated/`, respeitando a estrutura de pacotes.

```bash
# Para Linux/macOS
java -cp "figlan/bin:figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" figlan.compiler.Main figlan/examples/example1.fl
```

### Passo 4: Compilar o Programa Final Gerado

Agora que o `FiglanProgram.java` foi criado dentro da pasta de código-fonte, o passo mais simples e robusto é re-executar o comando de compilação principal (do Passo 2). Ele irá encontrar o novo ficheiro e compilá-lo corretamente para a pasta `bin`.

```bash
# Re-executa o comando de compilação principal
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" $(find figlan/src -name "*.java") $(find figlan/java-test -name "*.java")
```

### Passo 5: Executar o Programa Final

Finalmente, executamos o programa e vemos o resultado gráfico. Este comando agora funciona porque o Passo 4 colocou o `FiglanProgram.class` no local correto (`figlan/bin/figlan/generated/`).

```bash
java -cp figlan/bin figlan.generated.FiglanProgram
```

-----

### Limpeza

Para limpar todos os ficheiros gerados e começar do zero, pode executar os seguintes comandos:

```bash
rm -rf figlan/bin/*
rm -rf figlan/src/figlan/generated/*
```