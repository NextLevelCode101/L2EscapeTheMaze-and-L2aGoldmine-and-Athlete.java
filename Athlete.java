import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Athlete extends Robot
{
   public Athlete() {
      super(1,1, Display.NORTH, Display.INFINITY);
   }
   
   
   
   public Athlete(int x, int y, int direction, int beepers) {
   
      super(x,y, direction, beepers);
   }
   
   
   public void turnRight()
   {
      turnLeft();
      turnLeft();      
      turnLeft();
   }
   
   
   public void turnAround()
   {
      turnLeft();      
      turnLeft();   
   }

}



