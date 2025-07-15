# Compilador FigLan

Este repositório contém o código-fonte de um compilador para a linguagem **FigLan**, desenvolvida no âmbito da unidade curricular de **Compiladores**.

O compilador traduz código-fonte FigLan (`.fl`) para código Java executável, utilizando uma biblioteca gráfica para desenhar figuras geométricas.

---

## Estrutura de Pastas

- `figlan/examples/`: Ficheiros de exemplo com código FigLan.
- `figlan/java-test/`: Biblioteca gráfica (Point, Line, Circle, FigureBoard, etc.).
- `figlan/lib/`: JARs externos necessários (ANTLR, StringTemplate, JUnit).
- `figlan/src/figlan/`: Código-fonte do compilador:
  - `compiler/`: Main, CodeGenerator, SemanticAnalyser, TAC, etc.
  - `grammar/`: Gramática ANTLR `Figlan.g4`.
  - `generated/`: *(gerado)* Ficheiros Java criados pelo ANTLR.
- `figlan/bin/`: *(gerado)* Bytecode `.class` compilado.

---

## Pré-requisitos

- Java JDK 11 ou superior
- ANTLR 4.13.1 → `figlan/lib/antlr-4.13.1-complete.jar`
- StringTemplate 4.3.4 → `figlan/lib/ST-4.3.4.jar`

*(Opcional para testes)*:
- JUnit 4.13.2 → `figlan/lib/junit-4.13.2.jar`

---

## Scripts incluídos

### `compile.sh`

Compila tudo e gera o ficheiro Java a partir de um `.fl`:

```bash
./compile.sh figlan/examples/example1.fl
```

### `run.sh`

Executa o programa gerado (`FiglanProgram.java`):

```bash
./run.sh
```

### `clean.sh`

Remove tudo o que foi gerado:

```bash
./clean.sh
```

---

## Execução Manual (sem scripts)

### 1. Gerar o Parser com ANTLR

```bash
cd figlan/src/figlan/grammar
java -jar ../../../lib/antlr-4.13.1-complete.jar -o ../generated -package figlan.generated -visitor -no-listener Figlan.g4
cd ../../../../
```

### 2. Compilar compilador + runtime + ficheiros ANTLR

```bash
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" \
  $(find figlan/src -name "*.java") \
  $(find figlan/java-test -name "*.java")
```

### 3. Executar o compilador com um `.fl`

```bash
java -cp "figlan/bin:figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" \
  figlan.compiler.Main figlan/examples/example1.fl
```

### 4. Recompilar o Java gerado (FiglanProgram.java)

```bash
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" \
  $(find figlan/src -name "*.java") \
  $(find figlan/java-test -name "*.java")
```

### 5. Executar o programa final

```bash
java -cp figlan/bin figlan.generated.FiglanProgram
```

---

## Como executar testes

### Testes `.fl` (exemplos)

```bash
./clean.sh
./compile.sh figlan/examples/piscadela.fl
./run.sh
```

---

```bash
./clean.sh
./compile.sh figlan/examples/example1.fl
./run.sh
```

---

