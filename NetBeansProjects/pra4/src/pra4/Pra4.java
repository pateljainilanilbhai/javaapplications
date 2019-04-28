/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra4;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Pra4 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int i;
        int j;
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=n-i;j>0;j--)
            System.out.print("       ");
            for(j=0;j<i;j++)
            {
                System.out.printf("%7d",(int)Math.pow(2,j));
            }
            for(k=j;k>=0;k--)
            {
                 System.out.printf("%7d",(int)Math.pow(2,k));
            }
            System.out.print("\n");
           
        }
    }
    
}

