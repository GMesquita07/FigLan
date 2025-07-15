#!/bin/bash
# filepath: /home/mateus/Documents/UA/C/P/TPR/FigLan/compile.sh

# Cores para mensagens
GREEN='\033[0;32m'
RED='\033[0;31m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Garante que estamos na raiz do projeto
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT_DIR"

echo -e "${BLUE}Compilando o projeto FigLan...${NC}"

# Cria os diretórios necessários
mkdir -p figlan/bin figlan/src/figlan/generated

# Passo 1: Gerar o Parser a partir da Gramática
echo -e "${BLUE}Passo 1: Gerando parser ANTLR...${NC}"
cd figlan/src/figlan/grammar
java -jar ../../../lib/antlr-4.13.1-complete.jar -o ../generated -package figlan.generated -visitor -no-listener Figlan.g4
if [ $? -ne 0 ]; then
    echo -e "${RED}Erro ao gerar o parser!${NC}"
    exit 1
fi
cd "$ROOT_DIR"
echo -e "${GREEN}Parser gerado com sucesso!${NC}"

# Passo 2: Compilar o Código-Fonte do Compilador
echo -e "${BLUE}Passo 2: Compilando o código-fonte...${NC}"
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" $(find figlan/src -name "*.java") $(find figlan/java-test -name "*.java")
if [ $? -ne 0 ]; then
    echo -e "${RED}Erro ao compilar o código-fonte!${NC}"
    exit 1
fi
echo -e "${GREEN}Código-fonte compilado com sucesso!${NC}"

# Passo 3: Compilar um programa Figlan
if [ -z "$1" ]; then
    echo -e "${BLUE}Nenhum arquivo de entrada especificado. Use: ./compile.sh <arquivo.fl>${NC}"
    exit 0
fi

echo -e "${BLUE}Passo 3: Compilando o programa Figlan: $1${NC}"
java -cp "figlan/bin:figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" figlan.compiler.Main "$1"
if [ $? -ne 0 ]; then
    echo -e "${RED}Erro ao compilar o programa Figlan!${NC}"
    exit 1
fi
echo -e "${GREEN}Programa Figlan compilado com sucesso!${NC}"

# Passo 4: Compilar o Programa Final Gerado
echo -e "${BLUE}Passo 4: Compilando o programa Java gerado...${NC}"
javac -d figlan/bin -cp "figlan/lib/antlr-4.13.1-complete.jar:figlan/lib/ST-4.3.4.jar" $(find figlan/src -name "*.java") $(find figlan/java-test -name "*.java")
if [ $? -ne 0 ]; then
    echo -e "${RED}Erro ao compilar o programa Java gerado!${NC}"
    exit 1
fi
echo -e "${GREEN}Programa Java gerado compilado com sucesso!${NC}"

echo -e "${BLUE}Compilação concluída! Execute o programa com:${NC}"
echo -e "${GREEN}java -cp \"figlan/bin:figlan/java-test\" figlan.generated.FiglanProgram${NC}"