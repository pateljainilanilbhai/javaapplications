/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.lang.reflect.Array;
import java.util.Vector;

/**
 *
 * @author jainil
 */
class a
{
    int a=10;
    void display()
    {
        System.out.println("a ="+a);
    }
}
class b
{
    float a=30.2f;
    void display()
    {
        System.out.println("a ="+a);
    }
}
class c
{
    String a="jainil";
    void display()
    {
        System.out.println("a ="+a);
    }
}
class d
{
    short a=10;
    void display()
    {
        System.out.println("a ="+a);
    }
}
class e
{
    long a=9638519522L;
    void display()
    {
        System.out.println("a ="+a);
    }
}
public class VectoR {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //adding
        
        Vector v = new Vector();
        v.addElement(new a());
        v.addElement(new b());
        v.addElement(new c());
        v.addElement(new d());
        v.addElement(new e());
        
        //printing
        System.out.println("");
        System.out.println(((a)v.elementAt(0)).a);
        System.out.println(((b)v.elementAt(1)).a);
        System.out.println(((c)v.elementAt(2)).a);
        System.out.println(((d)v.elementAt(3)).a);
        System.out.println(((e)v.elementAt(4)).a);
        
        
        //re setting
        v.set(0, new e());
        v.set(1, new d());
        v.set(2, new c());
        v.set(3, new b());
        v.set(4, new a());
        
         //printing
        System.out.println("");
        System.out.println("");
        System.out.println(((e)v.elementAt(0)).a);
        System.out.println(((d)v.elementAt(1)).a);
        System.out.println(((c)v.elementAt(2)).a);
        System.out.println(((b)v.elementAt(3)).a);
        System.out.println(((a)v.elementAt(4)).a);
       

       //printing size of vector
        System.out.println("");
        System.out.println("");
        System.out.println("size="+v.size());
        
        
        
        //accessing value and changing them
        ((e)v.elementAt(0)).a=7984629771L;
        ((d)v.elementAt(1)).a=30;
        ((c)v.elementAt(2)).a="patel";
        ((b)v.elementAt(3)).a=98.32f;
        ((a)v.elementAt(4)).a=68;
        
        
        
        //printing
        System.out.println("");
        System.out.println("");
        System.out.println(((e)v.elementAt(0)).a);
        System.out.println(((d)v.elementAt(1)).a);
        System.out.println(((c)v.elementAt(2)).a);
        System.out.println(((b)v.elementAt(3)).a);
        System.out.println(((a)v.elementAt(4)).a);
        
        
        //accessing methods of all classes
        System.out.println("");
        System.out.println("");
        ((e)v.elementAt(0)).display();
        ((d)v.elementAt(1)).display();
        ((c)v.elementAt(2)).display();
        ((b)v.elementAt(3)).display();
        ((a)v.elementAt(4)).display();
        
        
        //inserting element at a particular index
        v.insertElementAt(new e(),0);
        v.insertElementAt(new d(),1);
        v.insertElementAt(new c(),2);
        v.insertElementAt(new b(),3);
        v.insertElementAt(new a(),4);
        ((e)v.elementAt(0)).display();
        ((d)v.elementAt(1)).display();
        ((c)v.elementAt(2)).display();
        ((b)v.elementAt(3)).display();
        ((a)v.elementAt(4)).display();
        ((e)v.elementAt(5)).display();
        ((d)v.elementAt(6)).display();
        ((c)v.elementAt(7)).display();
        ((b)v.elementAt(8)).display();
        ((a)v.elementAt(9)).display();
        
        
        //removing elements
        
        v.remove(0);
        v.remove(1);
        v.remove(2);
        v.remove(3);
        v.remove(4);
        ((d)v.elementAt(0)).display();
        ((b)v.elementAt(1)).display();
        ((e)v.elementAt(2)).display();
        ((c)v.elementAt(3)).display();
        ((a)v.elementAt(4)).display();
        
        //clearing vector on exiting
        v.clear();
    }
    
}
