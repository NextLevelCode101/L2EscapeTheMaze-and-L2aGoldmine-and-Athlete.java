import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;


public class L2EscapeTheMaze
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(10,10);
      Display.setSpeed(15);
      WorldFrame.getCurrent().setLocation(0,0);
      Athlete A1 = new Athlete();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.turnRight();
      A1.move();
      A1.putBeeper();
      A1.turnRight();
      A1.move();
      A1.putBeeper();
      A1.turnLeft();
      A1.move();
      A1.turnLeft();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.turnRight();
      A1.move();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.turnRight();
      A1.move();
      A1.putBeeper();
      A1.turnLeft();
      A1.move();
      A1.turnLeft();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.move();
      A1.putBeeper();
      A1.turnRight();
      A1.move();
      A1.putBeeper();
      A1.move();


      
      
    }
      
      
}      