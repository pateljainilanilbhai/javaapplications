/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication81;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jainil
 */
class student
{
    String name;
    int rollno;
}
public class JavaApplication81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<Integer,String> a=new TreeMap<Integer, String>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter name");
            String k=sc.next();
            System.out.println("enter roll no");
            Integer q=new Integer(sc.nextInt());
            a.put(q,k);           
        }
        System.out.println(a);
             
    }
    
}
