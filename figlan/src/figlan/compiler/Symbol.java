package figlan.compiler;

public class Symbol {
    private final FiglanType type;
    // Poderia ter outros campos no futuro, como o nome, o valor (para constantes), etc.

    public Symbol(FiglanType type) {
        this.type = type;
    }

    public FiglanType type() {
        return type;
    }

    @Override
    public String toString() {
        return type.name();
    }
}
