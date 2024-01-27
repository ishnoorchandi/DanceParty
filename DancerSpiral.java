import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DancerSpiral extends Dancer {
//default constructor
public DancerSpiral() {
super(1, 1, Display.EAST, 0);
}

//4-arg constructor
public DancerSpiral(int x, int y, int direction, int beepers) {
//invokes Athlete's 4-arg constructor
      super(x, y, direction, beepers);
}

//regular dancers just spin in place
//how boring
public void danceStep() {
turnLeft();
move();
turnLeft();
move();
turnLeft();
move();
turnLeft();            
      }

// TODO: Add the run method definition here
//       execute danceStep() at least 10 times
   public void run()
   {
   for(int i = 0;i<10;i++)
   {
   danceStep();
   }
   }

}