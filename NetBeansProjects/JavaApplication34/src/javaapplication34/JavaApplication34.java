/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package javaapplication34;

/**
*
* @author Administrator
*/
public class JavaApplication34 {

   /**
    * @param args the command line arguments
    */
   
   public static void main(String[] args) {
       // TODO code application logic here
       
               try
               {
                       int a = 5/0;
                       System.out.println("Value of a = "+a);
               }
               catch(ArithmeticException e)
               {
                       System.out.println("Exception = "+e);
               }
               try
               {
                int[] a =  new int[5];                        
                       a[2] = a[10]/0+2; // In this line a[10] is evaluated first, so handle ArrayIndexOutOfBounds first and then ArithmeticException... see below example
                       System.out.println("After exception occurs...");                        
               }
               catch(ArrayIndexOutOfBoundsException a)
               {
                       System.out.println("Array index Out of Bounds..");
               }
               
               finally
               {
                       //finally block is executed compulsorily irrespective of the occurrence of an error 
                       System.out.println("finally block executes after arithmetic exception occured and array out of bound occured");
               }
               
       
       
   }
   
}


