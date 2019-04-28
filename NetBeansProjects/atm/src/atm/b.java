/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jainil
 */

class a extends Thread
{
    public void run()
    {
       
      {
          try
          {
              sleep(200);
          }
          catch (Exception ex) {
              
          }
          System.out.print("aaaaaaaaaaaaaaaaaaa");
       }
    }
            
}
class c extends Thread
{
    public void run()
    {
       
        {
                try
          {
              sleep(200);
          }
          catch (Exception ex) {
              
          }
        System.out.print("\b");}
    
}
}





public class b
{
    
    public static void main(String[] args) {
        a a1 = new a();
        a c1 = new a();
        a1.setName("a");
        c1.setName("b");
        a1.start();
        c1.start();
        try{
        a1.join();
        c1.join();}
        catch (Exception ex) {
            
        }
        System.out.print("dbaiusfbguisafgiusdfvsdsuidhfviosk");
    }
}
