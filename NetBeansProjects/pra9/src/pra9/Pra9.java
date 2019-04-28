/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra9;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Pra9 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1;
        String s2=new String();
        int key;
        System.out.println("Enter data");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        System.out.println("Enter key");
        key=sc.nextInt();
        char a[]=new char[s1.length()];
        a=s1.toCharArray();
        int b[]=new int[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            b[i]=(int)a[i];
        }
        for(int i=0;i<s1.length();i++)
        {
            b[i]=(b[i]+key);
        }
    for(int i=0;i<s1.length();i++)
    {
        System.out.print((char)b[i]);
    }
    System.out.println("\nNow reversing");
    for(int i=0;i<s1.length();i++)
    {
        s2=s2+(char)(b[i]-key);
    }
            System.out.println(s2);
    }
    
}
