#!/bin/bash
# filepath: /home/mateus/Documents/UA/C/P/TPR/FigLan/run.sh

# Garante que estamos na raiz do projeto
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT_DIR"

# Executa o programa gerado
echo "Executando o programa FigLan..."
java -cp "figlan/bin:figlan/java-test" figlan.generated.FiglanProgram