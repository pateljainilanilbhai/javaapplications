/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jainil;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Jainil {
   
    public static boolean lastDigit(int a,int b)
    {
        if((b%10)==a)
        {return true;}
        else
        {return false;}
    }
    public static void main(String[] args) {
     
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter first no");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        if(lastDigit(a, b)==true)
             System.out.println("last digit matched");
        else
            System.out.println("last digit doesnot match");
    }

}


