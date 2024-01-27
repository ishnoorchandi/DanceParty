import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldFrame;

public class L15DanceParty
{
   public static void main(String[] args)
   {
   
   //default, empty display
      Display.openWorld("");
      Display.setSize(30,30);
      Display.setSpeed(5);
      WorldFrame.getCurrent().setLocation(0, 0);
   
   //instantiates 4 Dancer at their respective starting x-positions
      Dancer a = new Dancer(5, 3, 7, 100);
      Dancer b = new Dancer(15, 20, 35, 40);
      DancerSquare c = new DancerSquare(20, 15, 5, 10);
      DancerSquare d = new DancerSquare(11, 10, 1, 0);
      DancerCrazy e = new DancerCrazy(12, 10, 2, 0);
      DancerCrazy f = new DancerCrazy(13, 10, 2, 0);
      DancerDiag g = new DancerDiag(5, 20, 1, 100);
      DancerDiag h = new DancerDiag(14, 20, 1, 50);
      DancerDiag i = new DancerDiag(20, 20, 1, 100);
      DancerSpiral j = new DancerSpiral(30, 40, 20, 70);
      DancerSpiral k = new DancerSpiral(15, 75, 65, 35);


   //Creates a threat object for each dancer  
      Thread t1 = new Thread( a );
      Thread t2 = new Thread( b );
      Thread t3 = new Thread( c );
      Thread t4 = new Thread( d );
      Thread t5 = new Thread( e );
      Thread t6 = new Thread( f );
      Thread t7 = new Thread( g );
      Thread t8 = new Thread( h );
      Thread t9 = new Thread( i );
      Thread t10 = new Thread( j );
      Thread t11 = new Thread( k );

   /*Invokes the start method for each thread, which in turn,
   invokes the run method of the Dancer class*/  
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
      t8.start();
      t9.start();
      t10.start();
      t11.start();

   }
}
