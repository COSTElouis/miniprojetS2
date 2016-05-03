package miniprojetS2;

public class Cell
{
	/**
	 * 
	 */
	private Piece piece;
/**
 * if the cell don't ave pieces we create a null cell
 */
	public Cell()
	{
		this.piece = null;
	}
	/**
	 * create a cell with a piece
	 * @param piece
	 */
	public Cell(Piece piece)
	{
		this.piece=piece;
	}
	
	/**
	 * methode to string which return a letter for each pieces
	 */
	public String toString()
	{
		String a = null;
		if (this.piece == null)
			a = "|   ";
		else
		switch (this.piece.getName())
		{
		case "pawn": a = "| p ";
		case "tower": a = "| t ";
		case "knight": a = "| c ";
		case "king": a = "| k ";
		case "queen": a = "| q ";
		case "bishop": a = "| b ";
		}
		
		return a;
	}
	
	/**
	 * set a piece at the corresponding cell
	 * @param pieces
	 */
	public void setPiece(Piece pieces)
	{
		this.piece = pieces;
		
	}
}