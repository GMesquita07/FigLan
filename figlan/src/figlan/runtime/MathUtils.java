package figlan.runtime;

// figlan/runtime/MathUtils.java
public final class MathUtils {
    private MathUtils() {}

    /** Quociente inteiro estilo FigLan (trunca para -∞). */
    public static int idiv(int a, int b) {
        return Math.floorDiv(a, b);        // cobre negativos corretamente
    }
    public static int idiv(double a, double b) {
        return (int) Math.floor(a / b);
    }
}
