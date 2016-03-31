package miniprojetS2;

// TODO write javadoc comment
// Represent the chess game grid
public class Grid
{
	// TODO write javadoc comment
	// Represent the line's number of the chess game grid
	private final static int NUMBER_OF_LINES=8;
	
	// TODO write javadoc comment
	// Represent the column's number of the chess game grid
	private final static int NUMBER_OF_COLUMNS=8;
	

	
	
	// TODO write javadoc comment
	// This is the constructor of the chess game grid

	public Grid()
	{
		Grid[][] grid = null;
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				grid[numberoflines][numberofcolumn]=null;
			}
		}
	}
	
	public String toString()
	{
		Grid[][] gridString=null;
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				gridString[numberoflines][numberofcolumn]="|---";
			}
		}
	}
	
}
