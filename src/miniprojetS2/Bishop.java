package miniprojetS2;
/**
 * 
 * @author costel
 * class which creating a bishop piece.
 */
public class Bishop extends Piece
{
	/**
	 * constructor of the class Bishop
	 * @param nom
	 * @param color
	 */
	public Bishop(String nom, int color)
	{
		super("bishop", color);
	}
	
	/**
	 * the redefinition of method "isValid" of Piece superclass
	 * who return true if the movement of the Bishop matches with chess game rules 
	 */
	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (Math.abs(move.getFinish().getLine()-move.getStart().getLine())!=Math.abs(move.getFinish().getColumn()-move.getStart().getColumn()))
		{return false;}
		return true;
	}
}
