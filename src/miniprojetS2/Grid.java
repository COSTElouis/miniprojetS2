package miniprojetS2;

// TODO detail comment (represents the grid, coordinate system
/**
 *  Represent the chess game grid
 * @author costel
 *
 */
public class Grid
{
	// TODO write "javadoc" comment (not javadoc style) (done)
	/**
	 *  Represent the line's number of the chess game grid
	 */
	private final static int NUMBER_OF_LINES=8;
	
	// TODO write "javadoc" comment (not javadoc style) (done)
	/**
	 *  Represent the column's number of the chess game grid
	 */
	private final static int NUMBER_OF_COLUMNS=8;	
	
	// TODO write javadoc comment (done)
	/**
	 *  This is the constructor of the chess game grid
	 */

	public Grid()
	{
		// TODO the constructor is supposed to initialize fields, but this class defines no field.
		Grid[][] grid = null;
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				grid[numberoflines][numberofcolumn]=null;
			}
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		Grid[][] gridString=null;
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				gridString[numberoflines][numberofcolumn]=null;
			}
		}
		return null;
	}
	
}
