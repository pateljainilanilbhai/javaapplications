/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedefault;

/**
 *
 * @author jainil
 */
interface a
{
    default void display()
    {
        System.out.println("interface default method");
    }
}
public class Interfacedefault implements a{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interfacedefault b = new Interfacedefault();
                b.display();
    }
    
}
