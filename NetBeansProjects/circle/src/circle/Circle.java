/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    double radius;
    Circle()
    {
        radius=1;
    }
     Circle(double d)
    {
        radius=d;
    }
     double getarea()
     {
         return 3.14*radius*radius;
     }
     double getperimeter()
     {
         return 2*3.14*radius;
     }
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        d=sc.nextInt();
        Circle c=new Circle(d);
        System.out.println("Area is "+c.getarea());
        System.out.println("Perimeter is "+c.getperimeter());
        
    }
    
}
