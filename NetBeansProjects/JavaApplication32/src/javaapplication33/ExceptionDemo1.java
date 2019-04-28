/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package javaapplication33;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Division
{
   float divide(int a, int b) throws ArithmeticException
   {
       return(a/b);
   }
}
public class ExceptionDemo1 
{   
    static int demoproc(String s) {
        try {
            if (s == null) {
                throw new NullPointerException("String is null.");
            } else {
                return s.length();
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught inside demoproc method...");
            throw e; // rethrow the exception
        }
    }
       public static void main(String[] args) 
       {
           try
               {
                       int a = 5/0;
                       System.out.println("Value of a = "+a);
               }
               catch(ArithmeticException e)
               {
                       System.out.println("Exception = "+e);
               }
               finally
               {
                       //finally block is executed compulsorily irrespective of the occurrence of an error 
                       System.out.println("finally block executes ");
               }
               System.out.println("Rest of the code...");
             try
               {
                       int[] a =  new int[5];                        
                       a[2] = a[10]/0+2; // In this line a[10] is evaluated first, so handle ArrayIndexOutOfBounds first and then ArithmeticException... see below example
                       System.out.println("After exception occurs...");                        
               }
               catch(ArrayIndexOutOfBoundsException aioob)
               {
                       System.out.println("Array index Out of Bounds..");
               }
                try {
           int[] a = new int[5];
           
           try {
               a[2] = a[10] / 0 + 2;
           } catch(ArrayIndexOutOfBoundsException aioe)
           {
           System.out.println("Access of invalid index in array - index out of range...");
           }
           catch(ArithmeticException ae)
           {
           System.out.println("Enter valid denominator..");
           }finally {
               System.out.println("Within Inner finally block.....");
           }
     } catch(Exception e)
       {
       System.out.println("Unexpected exception occured... :::"+e);
       } finally {
           System.out.println("Finally block executed.....");
       }
   System.out.println("After fially block .......");
        try
               {
                       Class c = Class.forName("p1.ExceptionDemo3");                
                       System.out.println("2nd line");
               }
               catch(ClassNotFoundException e)
               {
                       System.out.println("Class not found..");
               }
         try
               {
                       FileInputStream fis = new FileInputStream("C:\\Arithmetic.java");
                       DataInputStream ds = new DataInputStream(fis);
               }
               catch(FileNotFoundException f)
               {
                       System.out.println("File not found..");
               }
          char c;
               String s = null;
               try
               {
                       int n = s.length();
               }
               catch(NullPointerException e)
               {
                       System.out.println(e);
               }int n1,n2;
                       float ans;


       Scanner ss = new Scanner(System.in);
       System.out.println("\nEnter number 1 :");
       n1 = ss.nextInt();
       System.out.println("\nEnter number 2 :");
       n2 = ss.nextInt();
       Division d = new Division();
       try
       {
           ans = d.divide(n1, n2);
           System.out.println("Ans = "+ans);
       }
       catch(ArithmeticException ae)
       {
           System.out.println("Denominator cant be zero."); // Write User-friendly message here
       }
try {
        String sss = null;
            int len = demoproc(sss);
            System.out.println("Lenght of the String is = " + len);
       } catch (NullPointerException e) {
            System.out.println("NullPointerException is caught in caller method if callee method not able to handle it.. " + e);
        }       
       }
}