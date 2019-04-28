package pract2;
import java.awt.PointerInfo;
interface p
{
    int a=1;
    void a();
}
interface p1 extends p
{
    int b=2;
   void b();
}
interface p2 extends p
{
    int c=3;
    void c();
}
interface p12 extends p1,p2
{
   
}
public class Pract2 implements p12{

    /**
     * @param args the command line arguments
     */
    public void a()
    {
        System.out.println("a = " + a);
    }
    public void b()
    {
        System.out.println("b = " + b);
    }
    public void c()
    {
        System.out.println("c = " + c);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pract2 pract2 = new Pract2();
        pract2.a();
        pract2.b();
        pract2.c();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);   
    }   
}