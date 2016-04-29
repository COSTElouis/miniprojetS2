package miniprojetS2;

// TODO detail comment (represents the grid, coordinate system (done)
/**
 *  Represent the chess game grid, which is composed by some cases. They can have a piece or not. 
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
	
	/**
	 * a case with his location (that why it's an array)
	 */
	
	private Case[][] cells;
	
	// TODO write javadoc comment (done)
	/**
	 *  This is the constructor of the chess game grid
	 */
	public Grid()
	{
		cells=new Case[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		// TODO the constructor is supposed to initialize fields, but this class defines no field. (done)
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				cells[numberoflines][numberofcolumn]=new Case();
			}
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String chessGrid = "";

		for (int numberOfLine = 0; numberOfLine < NUMBER_OF_LINES; numberOfLine++)
		{
			for (int numberOfColumn = 0; numberOfColumn < NUMBER_OF_COLUMNS; numberOfColumn++)
				chessGrid += this.cells[numberOfLine][numberOfColumn].toString();
			chessGrid += "¦\n+---";
				for (int numOflig = 0; numOflig < NUMBER_OF_LINES ; numOflig++)
					chessGrid +="+---";
				chessGrid += "+\n";
		}

		return chessGrid;
	}
	
}
