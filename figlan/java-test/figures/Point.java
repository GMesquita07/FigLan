// Ficheiro: figures/Point.java
package figures;

import java.awt.Graphics;

/**
 * Representa a figura 'point' da linguagem Figlan.
 * Um ponto é definido por coordenadas (x, y).
 */
public class Point extends Figure {

    /**
     * Construtor para um ponto.
     * @param x A coordenada x do ponto.
     * @param y A coordenada y do ponto.
     */
    public Point(double x, double y) {
        // A bounding box de um ponto pode ser um pequeno quadrado
        // para garantir que ele seja visível e possa ser redesenhado.
        // Aqui usamos um quadrado de 3x3 centrado em (x,y).
        super((int) x - 1, (int) y - 1, 3, 3);
    }

    /**
     * Retorna a coordenada X original do centro do ponto.
     * A função x() herdada de Figure retorna o canto da bounding box.
     */
    public int getCenterX() {
        return super.x() + 1;
    }
    
    /**
     * Retorna a coordenada Y original do centro do ponto.
     * A função y() herdada de Figure retorna o canto da bounding box.
     */
    public int getCenterY() {
        return super.y() + 1;
    }


    @Override
    protected void internalDraw(Graphics g) {
        // Desenha o ponto como um pequeno retângulo preenchido (3x3 pixels)
        // para que seja facilmente visível.
        g.fillRect(x(), y(), 3, 3);
    }

    @Override
    public String toString() {
        // Formato similar ao literal da linguagem: [x,y]
        return "[" + getCenterX() + "," + getCenterY() + "]";
    }
}