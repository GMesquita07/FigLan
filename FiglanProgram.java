package generated;

import figures.*;
import java.util.Scanner;
//  // Para imports adicionais, se necessário 

public class FiglanProgram {
    public static void main(String[] args) {
        FigureBoard board = FigureBoard.init("Figlan Output", 800, 600);
        Scanner scanner = new Scanner(System.in); 

        Point p = null;

        Line l1 = null;
        Line l2 = null;

        Circle c1 = null;
        Circle c2 = null;

        p = new Point(0, 0);
        l1 = new Line(p, new Point(3, 4));
        p = new Point(2, 2);
        c1 = new Circle(p, 1.5);
        l2 = new Line(new Point(1, 1), new Point(4, 4));
        c2 = new Circle(new Point(5, 5), 3);
        System.out.println("A circle: " + c1);
        board.draw(c1);
        board.draw(p);
        board.draw(l1);
        board.draw(l2);
        board.draw(c1);
        board.draw(c2);
        Utils.pause(1000);
        board.erase(c1);
        Utils.pause(1000);
        board.eraseAll();
    }
}
