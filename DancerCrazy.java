import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DancerCrazy extends Dancer  {
//default constructor
public DancerCrazy() {
super(1, 1, Display.EAST, 0);
}

//4-arg constructor
public DancerCrazy(int x, int y, int direction, int beepers) {
//invokes Athlete's 4-arg constructor
      super(x, y, direction, beepers);
}

//regular dancers just spin in place
//how boring
public void danceStep() {
move();
      for(int i = 0;i<10;i++)
      turnRight();
      move();
      for(int i = 0;i<10;i++)
      turnLeft();
      move();
      move();
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
