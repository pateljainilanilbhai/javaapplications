static boolean FindUnassignedLocation(int grid[][], int row, int col)
	{
	    for (row = 0; row < 9; row++)
	        for (col = 0; col < 9; col++)
	            if (grid[row][col] == 0)
	                return true;
	    return false;
	}










if (!FindUnassignedLocation(grid, row, col))
	       return true;