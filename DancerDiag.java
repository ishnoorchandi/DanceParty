import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DancerDiag extends Dancer {
//default constructor
public DancerDiag() {
super(1, 1, Display.EAST, 0);
}

//4-arg constructor
public DancerDiag(int x, int y, int direction, int beepers) {
//invokes Athlete's 4-arg constructor
      super(x, y, direction, beepers);
}

//regular dancers just spin in place
//how boring
public void danceStep() {
   for(int i = 0;i<3;i++)
      {
   if(frontIsClear()){
   move();
   turnRight();
   }
   if(frontIsClear())
   {
   move();
   turnLeft();
   }
   }
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
