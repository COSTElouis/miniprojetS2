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
	 * 
	 * a case with his location (that why it's an array)
	 */
	/**
	 * the ligne where we initialise the pieces at the beginnig of the game
	 */
	private int line;
	
	public Cell[][] cells;
	
	
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
			cells[0][0].setPiece(new Tower("tower",1));
			cells[1][0].setPiece(new Knight("knight",1));
			cells[2][0].setPiece(new Bishop("bishop",1));
			cells[3][0].setPiece(new Queen("queen",1));
			cells[4][0].setPiece(new King("king",1));
			cells[5][0].setPiece(new Bishop("bishop",1));
			cells[6][0].setPiece(new Knight("knight",1));
			cells[7][0].setPiece(new Tower("tower",1));		
			
			for (int line = 0; line <= 7; line++)
				cells[line][1].setPiece(new Pawn("pawn",1));
			
			cells[0][7].setPiece(new Tower("tower",0));
			cells[1][7].setPiece(new Knight("knight",0));
			cells[2][7].setPiece(new Bishop("bishop",0));
			cells[3][7].setPiece(new Queen("queen",0));
			cells[4][7].setPiece(new King("king",0));
			cells[5][7].setPiece(new Bishop("bishop",0));
			cells[6][7].setPiece(new Knight("knight",0));
			cells[7][7].setPiece(new Tower("tower",0));		
			
			for (int line = 0; line <= 7; line++)
				cells[line][6].setPiece(new Pawn("pawn",1));
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
	public Cell getCells(int x, int y)
	{
		return cells[x][y];
	}
	
	
}
