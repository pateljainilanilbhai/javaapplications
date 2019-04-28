package robot;
interface Motion
{
    void forward();
    void reverse();
    void stop();
}
interface Sound
{
    void beep();
}
abstract class Robot
{
    int position;
    public Robot() {
    }

    public Robot(int position) {
        this.position = position;
    }
    
     public void beep()
    {
        System.out.println(" beep in Robot Parent" );
    }
    public void forward() {
        System.out.println("forward Robot Parent");
        position++;
    }

   
    public void reverse() {
        System.out.println("reverse Robot Parent"); 
    position--;}
    

    
    public void stop() {
        System.out.println("stop Robot Parent position is "+position);   }
}
class RobotA extends Robot implements Sound
{

    public RobotA() {
    }
    public void beep()
    {
        System.out.println("beep in Robot A");
    }
}
class RobotB extends Robot implements Motion,Sound
{

    public RobotB() {
    }

   public void beep()
    {
        System.out.println("beep in Robot B" );
    }
    public void forward() {
        System.out.println("forward B");
        position++;
    }
    public void reverse() {
        System.out.println("reverse B"); position--;}

    
    public void stop() {
        System.out.println("stop B position is "+position  );}
    
}
class RobotC extends Robot implements Motion,Sound
{

    public RobotC() {
    }
    public void beep()
    {
        System.out.println("beep in Robot C");
    }
    public void forward() {
        System.out.println("forward C"); position++;
    }

   
    public void reverse() {
        System.out.println("reverse C"); position--;}

    
    public void stop() {
        System.out.println("stop C position is "+position);   }
}
class RobotA1 extends RobotA
{}
class RobotB1 extends RobotB
{}
class RobotC1 extends RobotC
{}
public class demo {
    public static void main(String[] args) {
        // TODO code application logic here
        RobotA1 robotA1 = new RobotA1();
        RobotB1 robotB1 = new RobotB1();
        RobotC1 robotC1 = new RobotC1();
        robotA1.beep();
        robotA1.forward();
        robotA1.reverse();
        robotA1.stop();
        robotB1.beep();
        robotB1.forward();
        robotB1.reverse();
        robotB1.stop();
        robotC1.beep();
        robotC1.forward();
        robotC1.reverse();
        robotC1.stop();
    }    
}
