/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import java.util.*;




/**
 *
 * @author jainil
 */
interface a
{
    default void display()
    {
        System.out.println("AAAAAAAA");
    }
}
interface b
{
    default void displayy()
    {
        System.out.println("BBBBBBBBB");
    }
}
public class JavaApplication28 implements a,b{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaApplication28().display();
        
    }
    
}
