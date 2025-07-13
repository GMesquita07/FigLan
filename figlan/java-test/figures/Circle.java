// Ficheiro: figures/Circle.java
package figures;

import java.awt.Graphics;

// A classe Circle herda de Figure
public class Circle extends Figure {

    private Point center;
    private int radius;

    // O construtor recebe os dados definidos no Figlan
    // Ex: new circle([10, 20], 5) ou [10, 20] | 5
    public Circle(Point center, double radius) {
        // O construtor da classe base (Figure) precisa da boundingBox.
        // Calculamos o x, y, largura e altura a partir do centro e raio.
        super((int) (center.x() - radius), (int) (center.y() - radius), (int) (radius * 2), (int) (radius * 2));

        // Armazenamos os dados específicos do círculo
        this.center = center;
        this.radius = (int) radius;
    }

    // Implementação do método de desenho obrigatório
    @Override
    protected void internalDraw(Graphics g) {
        // A classe Graphics do Java AWT tem um método para desenhar ovais.
        // Fornecemos o canto superior esquerdo (que já calculamos no super()),
        // e a largura e altura.
        g.drawOval(x(), y(), width(), height());
    }

    // Você também pode querer adicionar um toString() para debugging
    @Override
    public String toString() {
        return "circle(" + center.toString() + "," + radius + ")";
    }
}