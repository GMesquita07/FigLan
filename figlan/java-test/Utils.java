package figures;

public class Utils {
   public static void pause(int ms) {
      try {
         Thread.sleep(ms);
      }
      catch(InterruptedException e) {
         // ignore pause interruption!
      }
   }
}

