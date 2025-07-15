#!/bin/bash
# filepath: /home/mateus/Documents/UA/C/P/TPR/FigLan/clean.sh

# Cores para mensagens
RED='\033[0;31m'
GREEN='\033[0;32m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Garante que estamos na raiz do projeto
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT_DIR"

echo -e "${BLUE}Limpando os diretórios gerados...${NC}"

# Limpa o diretório bin
if [ -d "figlan/bin" ]; then
    echo -e "Limpando ${BLUE}figlan/bin${NC}..."
    rm -rf figlan/bin/*
    echo -e "${GREEN}✓${NC} Diretório bin limpo."
fi

# Limpa o diretório de arquivos gerados
if [ -d "figlan/src/figlan/generated" ]; then
    echo -e "Limpando ${BLUE}figlan/src/figlan/generated${NC}..."
    rm -rf figlan/src/figlan/generated/*
    echo -e "${GREEN}✓${NC} Diretório generated limpo."
fi

echo -e "${GREEN}Limpeza concluída!${NC}"