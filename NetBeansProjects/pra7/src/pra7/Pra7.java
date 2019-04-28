/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra7;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Pra7 {

    static int stringMatch(String a,String b)
    {
        int count=0;
        for(int i=0;i<a.length()-1;i++)
					{
						if(((i+1)<a.length())&&((i+1)<b.length()))
								{
						if ((a.charAt(i)==b.charAt(i))&&(a.charAt(i+1)==b.charAt(i+1)))
						{
							count++;
						}
								}
					}
        return count;
    }
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					Scanner sc=new Scanner(System.in);
		int count=0;
					String a;
					String b;
					System.out.println("enter first string");
					a=sc.next();
					System.out.println("enter second string");
					b=sc.next();
					count=stringMatch(a, b);
					System.out.println(count);
	}

    
}
