/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pakages;
import pack1.pack1;
import pakages.pack2;
/**
 *
 * @author jainil
 */
public class demo {

    /**
     * @param args the command line arguments
     */
        void defaultmethod()
        {
                System.out.println("Hello from packages default method");
        }
    public void method()
        {
                System.out.println("Hello from packages public method");
        }
    private void privatemethod()
        {
                System.out.println("Hello from packages private method");
        }
    protected void protectedmethod()
        {
                System.out.println("Hello from packages protected method");
        }

    public static void main(String[] args) {
        // TODO code application logic here
        pack1 p = new pack1();
        pack2 pa = new pack2();
        demo pac = new demo();
        p.method();
        pa.defaultmethod();
        pa.method();
        pa.protectedmethod();
        pac.defaultmethod();
        pac.privatemethod();
        pac.protectedmethod();
        pac.method();       
    }
    
}
