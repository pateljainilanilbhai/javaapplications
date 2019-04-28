/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Sudoku {

    public static void printGrid(int grid[][])
	{
	    for (int row = 0; row < 9; row++)
	    {
	        for (int col = 0; col < 9; col++)
	           System.out.print(grid[row][col]+"  ");
	        System.out.println();
	        }
	}
	public static void main(String[] args)
	{
	int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("your question here 0 means unassigned");
		 int grid[][]={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
		 int a[][]=new int[9][9];
		 printGrid(grid);
		 start:
		 System.out.println("Enter your answer:");
		 for(int i=0;i<9;i++)
		    {
		        for(int j=0;j<9;j++)
		        {
		        	System.out.println("enter "+i+" "+j+" "+"digit:");
		            a[i][j]=sc.nextInt();
		        }
		    }
		int ans[][]={{5,3,4,6,7,8,9,1,2},{6,7,2,1,9,5,3,4,8},{1,9,8,3,4,2,5,6,7},{8,5,9,7,6,1,4,2,3},{4,2,6,8,5,3,7,9,1},{7,1,3,9,2,4,8,5,6},{9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},{3,4,5,2,8,6,1,7,9}};
                aa:         
                for (int i = 0; i < 9; i++) {
                              for (int j = 0; j < 9; j++) {
                                  if(a[i][j]!=ans[i][j])
                                  {
                                      flag=1;
                                      break aa;
                                      
                                  }
                              }
                
            }
            
                if(flag==0)
		{
			System.out.println("Congrats your answer is correct");
		}
		else
		{
			System.out.println("sorry do you want to see answer");
			
			{
				System.out.println("your wrong input");
				printGrid(a);
				System.out.println("your correct answer is");
				printGrid(ans);
			}
			
			
		}
	}
    
}
