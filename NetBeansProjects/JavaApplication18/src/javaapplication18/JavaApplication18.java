package javaapplication18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class Abstactclass
{
    public int s=20;
    Abstactclass()
    {
        
    }
    Abstactclass(int a)
    {
        s=a;
    }
    void  prints()
    {
        System.out.println("JAINIL "+s);
    }
    void abstactclassmethod()
    {
        System.out.println("Good morning abstact class!!");
    }
   abstract void drag();
}
interface interfaceclass 
{   public int a=50;
    default void  print()
    {
        System.out.println("JAINIL "+a);
    }
    default void good()
    {
        System.out.println("Good morning interface!!");
    }
    abstract void j();
}

public class JavaApplication18 implements interfaceclass {
void drag()//extended w should get defination of abstact method
{System.out.println("Entended abstract method defined");}
public void j()//extended b should get defination of abstact method
{System.out.println("defination of abstact method in interface  which is extended");}
    public static void main(String[] args) {
      JavaApplication18 q=new JavaApplication18();
            //extended abstact class normal method call
      q.drag();     //extended abstract class's abstact method call
      q.print();  //no definsation required of implemented interface????????????????????????
      q.good(); //no definsation required of implemented interface??????????????????????????
      //object of abstract  class???????????????????????
      Abstactclass w1 = new Abstactclass(){void drag(){System.out.println("Object created") ;h();}void h(){System.out.println("hello");}};
      //now calling object method of abstact class
      
        w1.abstactclassmethod();
        w1.prints();
        w1.drag();
        w1.s=50; //changing variable in abstact obj is allowed
        // object of abstract class with paramerters???????????????????????
         Abstactclass w2 = new Abstactclass(500){void drag(){System.out.println("Object created");}};
      
        w2.abstactclassmethod();
        w2.prints();
        w2.drag();
    }
}
