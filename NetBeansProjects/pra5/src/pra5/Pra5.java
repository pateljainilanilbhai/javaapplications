/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra5;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Pra5 {

   

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		String a[]=new String[8];
		for(int i=0;i<8;i++)
		{
			a[i]=sc.next();
		}
		String answerkey="DBDCCDAEAD";
				int marks[]=new int[8];
				for(int i=0;i<8;i++)
				{
					marks[i]=0;
				}
				for(int i=0;i<8;i++)
				{
					for(int j=0;j<10;j++)
					{
						if(answerkey.charAt(j)==a[i].charAt(j))
						{
							marks[i]=marks[i]+1;
						}
					}
				}
				for(int i=0;i<8;i++)
				{
					System.out.println("Marks of student "+i+"="+marks[i]);
				}
	}

}
/*
ABACCDEEAD
DBABCAEEAD
EDDACBEEAD
CBAEDCEEAD
ABDCCDEEAD
BBECCDEEAD
BBACCDEEAD
EBECCDEEAD
*/
    

