package miniprojetS2;
/**
 * 
 * @author costel
 * class which creating a bishop piece.
 */
public class Bishop extends Piece
{

	public Bishop(String nom, int color)
	{
		super("bishop", color);
	}
	
	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (Math.abs(move.getFinish().getLine()-move.getStart().getLine())!=Math.abs(move.getFinish().getColumn()-move.getStart().getColumn()))
		{return false;}
		return true;
	}
}
