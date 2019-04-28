/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra3;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Pra3 {

    /**
     * @param args the command line arguments
     */
 public static int[] fic34(int a[])
	{
		if(a.length==2)
		{
			if(a[0]==4&&a[1]==3)
			{
				a[0]=3;a[1]=4;
			}
			if(a[0]==3&&a[1]==4)
			{
				a[0]=3;a[1]=4;
			}
		}
		else{
		int i=0,j=0,k=0;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==3)
			{
				if(i==0||a[i+1]!=4||i==a.length)
				{
					for(k=0;j<a.length;k++)
					{
						if(a[k]==4)
						{
							if(k==0||a[k-1]!=3)
							{
								int temp;
								temp=a[i+1];
								a[i+1]=a[k];
								a[k]=temp;
								break;
							}
						}
					}
				}
			}
		}}
		return a;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of terms");
		size=sc.nextInt();
                System.out.println("Enter"+size+" numbers");
		int a[]=new int[size];
		int i=0;
		for(i=0;i<size;i++)
		{
		a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		b=Pra3.fic34(a);
		System.out.println();
		System.out.println();
		for(i=0;i<size;i++)
		{
		System.out.print(b[i]+" ");
		}
		}
}
