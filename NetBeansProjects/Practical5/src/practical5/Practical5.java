
package practical5;

import java.util.Scanner;

public class Practical5 {

    int radius;
    double area()
    {
        return (3.14*radius*radius);
    }
    double area(int r)
    {
        return (3.14*r*r);
    }
    double area(double r)
    {
        return (3.14*r*r);
    }
    void area(double ...a)
    {
        for (double d : a) {
            System.out.println("Area is "+(3.14*d*d));
        }
    }
    void area(int ...a)
    {
         for (int d : a) {
            System.out.println("Area is "+(3.14*d*d));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Practical5 p = new Practical5();
        int a;
        System.out.println("Enter radius");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        p.radius=a;
        System.out.println("Area 1 is"+p.area());
        System.out.println("Area by one int parameter");
        System.out.println("Area 2 is"+p.area(25));
        System.out.println("Area with double parameter");
        System.out.println("Area 3 is"+p.area(26.3));
        System.out.println("Array passing by many int values");
        p.area(25.0,30.5,50.3,60.2);
        System.out.println("Area by passing many double");
        p.area(10,20,30,40,50,60);
    }
    
}
