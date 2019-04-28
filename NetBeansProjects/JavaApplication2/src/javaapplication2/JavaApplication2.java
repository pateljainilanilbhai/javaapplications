/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

  static boolean UsedInBox(int grid[][], int boxStartRow, int boxStartCol, int num)
	{
	    for (int row = 0; row < 3; row++)
	        for (int col = 0; col < 3; col++)
	            if (grid[row+boxStartRow][col+boxStartCol] == num)
	                return true;
	    return false;
	}/* Returns whether it will be legal to assign num to the given row,col location.
	 */
	static boolean isSafe(int grid[][], int row, int col, int num)
	{
	    return !UsedInRow(grid, row, num) && !UsedInCol(grid, col, num) &&!UsedInBox(grid, row - row % 3 , col - col % 3, num);
	}
	
	static boolean SolveSudoku(int grid[][])
	{
	    int row=0, col=0;
	    
	    for (int num = 1; num <= 9; num++)
	    {
	        if (isSafe(grid, row, col, num))
	        {
	            grid[row][col] = num;
	            if (SolveSudoku(grid))
	                return true;
	            grid[row][col] = 0;
	        }
	    }
	    return false;
	}
	/* Searches the grid to find an entry that is still unassigned. */
	
	/* Returns whether any assigned entry n the specified row matches
	   the given number. */
	static boolean UsedInRow(int grid[][], int row, int num)
	{
	    for (int col = 0; col < 9; col++)
	        if (grid[row][col] == num)
	            return true;
	    return false;
	}
	/* Returns whether any assigned entry in the specified column matches
	   the given number. */
	static boolean UsedInCol(int grid[][], int col, int num)
	{
	    for (int row = 0; row < 9; row++)
	        if (grid[row][col] == num)
	            return true;
	    return false;
	}/* Returns whether any assigned entry within the specified 3x3 box matches
	   the given number. */
	
	/* print grid  */
	static void printGrid(int grid[][])
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
		Scanner sc=new Scanner(System.in);
                System.out.print("___________________________________________$$s\n    _________________________$____$$s___________s$$s\n_________________________s$$$$s$$$$$$s________$$$___s$\n_______________s$$$$$$$$s___s$$$$ss$$$$s________$$$__$$\n________________________s$$$s__$$$$$s_$$$s___s$__s$$s_$$\n__________s$$$$$$$$$$$$$$$$$$$$sss$$$$s_$$$s__$$$__s$$s$\n_____s$$$$$$$$$s_____s$$$$$$$$$$$$$$h$$$__$$$s__$$___$$$\n___s$$$$$s_____________________ss$$$$$$$$s_s$$$s$$$__s$$$\n__________________________s$$$s____s$$$$$$$$s$$$$$$$__$$$\n_________s$$$$$$$$$$$$$$$s$$$$$$$$$$s$$$$$$$$$ss$$$$s_$$$\n_____________________s$$$$$$$$$$s$$$s____s$$$$$$__$$$__$$\n________________s$$$$$$$$$$$$$$$$$$$$$$s_____s$$$s_$$__$$\n________s$$$$$$$$$$$$$$$$$$$$$$$s$s__s$$$$$$s___$$s_$s$$$\n_____s$$$$$s$$$$$$$$$$$$$$s____$$s$$$$$$$$$$$$$s____$$$$s\n___s$$$$__s$$$$$$$$$s_____s$$$$$s$$$$$$$$$$$$$$$$$s__$$$\n___s$___$$$$$$______s$$$$$$$s_s$$$$$$$$$$$$$$$$$$$$$____$$$\n______s$$$s___s$$$$$$$$$$$___$$$$$$$$$$$$$$$$$$$$$$$$s$$$$$$$s\n\_____$$$__s$$$$$$$$$$$$$$__$$$$$$$$$$$$$$$$$$$$s$s$_$$$$$$$$$$$\n____$$$_$$$$$$i$$$$$s_$$__$$$$$$$$$$$$$$$$$$$ss$$$s$$$$$$$$s$$s\n___$$__$$$__s$$$$ss__$$_$$$$$$$$$$$$$$$$$$$$s$$$$$_$$$$e$$s$\n__$$_s$$___$$$$s_$$_$$s$$$$$$$$$$$$$$$$$$$$s$$$$$s_$$$$$$s$\n_s$s$$$___$$$$_s$$__$$__$$$$$$$$$$$$$$$$$$_$$$$$$$_s_$$$\n_$$s$s__s$$$__$$____s$$__$$$$$$$$$$$$$$$$$_$$$$$$$$__$$$\n$$_$___$$$$_s$$__$$__$$$s__s$$$$$$$$$$$$$$_$$$$$$$$$$$$s\n$$____$$$s_$$$__$$$_$_s$$$$s___s$s$$$$$$$$_$$$$$$$$s$$$\n$____$$$__$$sss$$$$__$_s$$$$$$$$$$s$s$$$$$___s$$$$s$$$s\n____$$$_s$$$_$s$$$$s_s$__$$$$$$___s$$s_$$$s___s$$$_$$$\n____$$_s$$$_$$_s$$$$$_s$$___$$$$$________$_____$$$s$$s\n___s$$_$$$__$$__$$$$$$$$$$s____s$$$$$_________s$$$$$$\n___$$$s$$$__$$___$$ss$$$$$$$$s____s$$$$$s______$$$$$$\n___$s$$$$$_s$$__s_$$$_s$$$$$$$$$$s___s$$$$$$$s___sss\n___$$$$$$$_$$$__$s_$$$$s__s$$$$$$$$$s___$$$$$$$s\n__s$$$$$$$_$$$s_s$__$$$$$$s__s$$$$$$$$$s__$__$$$$s\n__$_$$$$s$_s$$$__$$__$$$$$$$$s__$$s$$$$$$$_____$$$$\n____s$$$_$$_$$$___$$__$s$$$$$$$$_s__s$$$s$$$____$$$$\n_____$$$__$_$$$$___$$_ss_$$$$$$$$$____$$$$_s$____$$$s\n_____$$$s_$_s$$$s__$$$____s$$$$$$$$$___s$$$______$$$$\n_____s$$$_ss_$$$$___$$s____$$$$$$$$$$___$$$$_____s$$$\n______$k$__$__$$$$__s$$____$$$$$$$h$$____$$$$_____$$s\n______$$$______$$$s__$$$___$$_$$$$$$$$___s$$$$____$$\n_______$$s______$$$__s$$$___$_s$$$$$s____s$$$$____$s\n_______$$$_______$$$_s$$_$__$__$$$$$s____s$$$$___$$\n________$$_______s$$__$$_______$$$$$s____$$$$$___$s\n________$$________s$$_$$______s$$$$$_____$$_$$___$\n___________________$$_$$s_____$$$$$_____$$s_$s\n____________________$$s$$_____$$$$_____s$$__$\n____________________s$_$$____$$$s_____s$$\n_____________________$_$$___$$$______s$$\n_______________________$$__s$$______$$$\n________________________$__$$______$$$\n________________________$_$$s____$$$s\n__________________________$$___s$$s\n__________________________$$__$$s\n\n");

		 int grid[][]=new int [9][9];
		    System.out.println("Solving 9*9 sudoku:");
		    System.out.println("enter sudoku row wise:");
		    System.out.println("enter 0 for unknown:");
		    for(int i=0;i<9;i++)
		    {
		        for(int j=0;j<9;j++)
		        {
		        	System.out.println("enter "+i+" "+j+" "+"digit:");
		            grid[i][j]=sc.nextInt();
		        }
		    }

		    if (SolveSudoku(grid) == true)
		          printGrid(grid);
		    else
		       System.out.println("No solution exists");
		        
	}
    
}
