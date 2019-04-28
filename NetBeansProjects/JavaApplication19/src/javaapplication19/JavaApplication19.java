/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
class a
{
    int a;
    a()
    {
        a=5;
    }

    public a(int a) {
        this.a = a;
    }
    

 

    public int getA() {
        return a;
    }
    public void display()
    {
        System.out.println("a ="+a);
    }
    
 }


public class JavaApplication19 
{
    public static void main(String[] args) {
            
    
    a a1[] = new a[10];
    a1[1].display();
   
    }
}
