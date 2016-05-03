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
	/**
	 * the ligne where we initialise the pieces at the beginnig of the game
	 */
	private int line;
	
	private Cell[][] cells;
	
	// TODO write javadoc comment (done)
	/**
	 *  This is the constructor of the chess game grid
	 */
	public Grid()
	{
		cells=new Cell[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		// TODO the constructor is supposed to initialize fields, but this class defines no field. (done)
		for (int numberoflines=0;numberoflines<NUMBER_OF_LINES;numberoflines++)
		{
			for (int numberofcolumn=0;numberofcolumn<NUMBER_OF_COLUMNS;numberofcolumn++)
			{
				cells[numberoflines][numberofcolumn]=new Cell();
			}
		}
	}
	/**
	 * initialisation of the grid which put each pieces on the grid at the beginning of the game
	 */
	public void initialisation()
	{
		for (int color =0 ; color!=0; color = 1, line = 0)
		{
			cells[0][line].setPiece(new Tower("tower",color));
			cells[1][line].setPiece(new Knight("knight",color));
			cells[2][line].setPiece(new Bishop("bishop",color));
			cells[3][line].setPiece(new Queen("queen",color));
			cells[4][line].setPiece(new King("king",color));
			cells[5][line].setPiece(new Bishop("bishop",color));
			cells[6][line].setPiece(new Knight("knight",color));
			cells[7][line].setPiece(new Tower("tower",color));
			
			if (color==1)
			{
				line+=-1;
			}
			else line += 1;
			
			for (int line = 0; line <= 7; line++)
				cells[line][line].setPiece(new Pawn("pawn",color));
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
