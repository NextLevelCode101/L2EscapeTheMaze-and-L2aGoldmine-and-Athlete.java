import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;


public class L2aGoldmine{
   public static void main(String[] args)
   {
      Display.openWorld("maps/goldmine.map");
      Display.setSize(8,8);
      Display.setSpeed(8);
      WorldFrame.getCurrent().setLocation(0,0);
      Athlete john = new Athlete(1,1, Display.NORTH,0);
      Athlete pete = new Athlete(1,7, Display.EAST,0);
      Athlete joe = new Athlete(8,7, Display.SOUTH,0);
      Athlete jack = new Athlete(8,4, Display.WEST,0);  
      john.move();    
      john.move();
      john.move();
      john.pickBeeper();
      john.move();
      john.move();
      john.move();
      john.putBeeper();
      pete.pickBeeper();
      pete.move();
      pete.move();
      pete.move();
      pete.move();
      pete.move();
      pete.pickBeeper();
      pete.pickBeeper();
      pete.move();
      pete.move();
      pete.putBeeper();
      joe.pickBeeper();
      joe.move();
      joe.pickBeeper();
      joe.pickBeeper();
      joe.pickBeeper();    
      joe.move();
      joe.move();
      joe.putBeeper();
      jack.pickBeeper();
      jack.move();
      jack.move();
      jack.pickBeeper();
      jack.pickBeeper();
      jack.pickBeeper();
      jack.pickBeeper();
      jack.move();
      jack.move();
      jack.putBeeper();
      jack.putBeeper(); 
      jack.putBeeper(); 
      jack.putBeeper();  
      jack.move();     
    
    
    
    
    
    }
      
      
}      