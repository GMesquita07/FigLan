// Ficheiro: figures/Circle.java
package figures;

import java.awt.Graphics;

public class Circle extends Figure {

    private Point center;
    // CORREÇÃO 1: O raio agora é double para manter a precisão.
    private double radius;

    public Circle(Point center, double radius) {
        // CORREÇÃO 2: Usa getCenterX() e getCenterY() para os cálculos.
        super(
            (int) (center.getCenterX() - radius), 
            (int) (center.getCenterY() - radius), 
            (int) (radius * 2), 
            (int) (radius * 2)
        );

        this.center = center;
        // CORREÇÃO 1: Remove a conversão para (int).
        this.radius = radius;
    }

    @Override
    protected void internalDraw(Graphics g) {
        g.drawOval(x(), y(), width(), height());
    }

    @Override
    public String toString() {
        // CORREÇÃO 1: Agora imprime o valor double correto.
        return "circle(" + center.toString() + "," + radius + ")";
    }
}