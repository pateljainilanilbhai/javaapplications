package override;

/**
 *
 * @author jainil
 */
interface a
{
   public  void interfacemethod();
}
abstract class Abs implements a
{
    public Abs() {
        System.out.println("Abstract object formed!!");
    }
    
    abstract public void disp();
}
class ABC{
    public ABC() {
    }
   public void disp()
   {
      System.out.println("disp() method of parent class");
   }
   public void abc()
   {
      System.out.println("abc() method of parent class");
   }	   
}
class Override extends ABC{

    public Override() {        
    }
    
   public void disp(){
      System.out.println("disp() method of Child class");
   }
   public void xyz(){
      System.out.println("xyz() method of Child class");
   }
   public  int method()
       {
           try
           {System.out.println("try wants to return 1000");return 1000;}
        finally
        {System.out.println("finnally callled overridind return");return 5000;}
       }
   public static void main( String args[]) {
       
       System.out.println("Abs is abstact class implementing a.ABC is parent and Override is child of ABC");
       
      //Parent class reference to child class object
       System.out.println("ABC abc=new ABC();");
      ABC abc=new ABC();
      abc.disp();
      abc.abc();
      
      
       System.out.println("Override o = new Override();");
      Override o = new Override();
      o.abc();
      o.disp();
      o.xyz();
      
      
       System.out.println("ABC obj = new Override();");
      ABC obj = new Override();
      obj.disp();
      obj.abc();
      //obj.xyz();
      
       System.out.println("TRICKY Override -> Override oo=new Override()");
      Override oo=new Override(){public void abc(){System.out.println("OVERRIDE ABC EXPLICITLY IN MAIN BY OVERRIDE");}public void disp(){System.out.println("OVERRIDE EXPLICITLY DISPLAY IN MAIN BY OVERRIDE");}public void xyz(){System.out.println("OVERRIDE EXPLICITLY XYZ IN MAIN BY OVERRIDE");}};
      oo.abc();
      oo.disp();
      oo.xyz();
      
      
       System.out.println("TRICKY ABSTRACT OBJECT IMPLEMENTING INTERFACE a ->Abs abs = new Abs()");
       Abs abs = new Abs(){public void disp(){System.out.println("DECLARATION OF DISP IN MAIN BY OVERRIDE");} public void interfacemethod(){System.out.println("INTERFACE METHOD DEFINATION IN MAIN BY OVERRIDING");}};
       abs.disp();
       
       System.out.println("TRICKY OVERIDING THE RETURNED VALUE!!");
       Override ooo = new Override();
       System.out.println("returned value is "+ooo.method());
   }
}
