// Ficheiro: figures/Line.java
package figures;

import java.awt.Graphics;

/**
 * [cite_start]Representa a figura 'line' da linguagem Figlan[cite: 6].
 * Uma linha é definida por dois pontos.
 */
public class Line extends Figure {

    private Point p1;
    private Point p2;

    /**
     * Construtor para uma linha, que recebe dois objetos Point.
     * @param p1 O ponto inicial da linha.
     * @param p2 O ponto final da linha.
     */
    public Line(Point p1, Point p2) {
        // Calcula a Bounding Box que contém toda a linha.
        // O canto superior esquerdo é o menor x e o menor y.
        // A largura e altura são as diferenças absolutas entre as coordenadas.
        super(
            Math.min(p1.getCenterX(), p2.getCenterX()),
            Math.min(p1.getCenterY(), p2.getCenterY()),
            Math.abs(p1.getCenterX() - p2.getCenterX()) + 1,
            Math.abs(p1.getCenterY() - p2.getCenterY()) + 1
        );

        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    protected void internalDraw(Graphics g) {
        // Desenha a linha usando as coordenadas originais dos pontos.
        // As coordenadas são relativas ao componente (FigureBoard), não à bounding box.
        g.drawLine(p1.getCenterX(), p1.getCenterY(), p2.getCenterX(), p2.getCenterY());
    }

    @Override
    public String toString() {
        // Formato similar à construção com 'new': line(p1, p2)
        return "line(" + p1.toString() + "," + p2.toString() + ")";
    }
}