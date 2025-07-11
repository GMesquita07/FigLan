import static java.lang.System.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import figures.*;

public class TestFigures
{
   static public void main(String[] args)
   {
      FigureBoard board = FigureBoard.init("Test", 400, 300);
      Figure f = new DummyFigure();
      for(int i = 0; i < 3; i++) {
         board.draw(f);
         Utils.pause(500); // 1/2 second
         board.erase(f);
         Utils.pause(500); // 1/2 second
      }

      /* Draw figures with:
       *
       * board.draw(...);
       *
       * and erase them with:
       *
       * board.erase(...);
       *
       */
   }
}
