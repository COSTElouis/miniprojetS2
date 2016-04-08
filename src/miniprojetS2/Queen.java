package miniprojetS2;
// TODO fix comment (done)
/**
 * class which creating a Queen piece.
 * @author costel
 * 
 */
public class Queen extends Piece
{
	// TODO write comment (done)
	/**
	 * constructor of the queen piece
	 * @param nom
	 * @param color
	 */
	public Queen(String nom, int color)
	{
		super(nom, color);
	}
	// TODO write comment (done)
	/**
	 * the redefinition of method "isValid" of Piece superclass
	 * who return true if the movement of the queen matches with chess game rules 
	 */
	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (Math.abs(move.getFinish().getLine()-move.getStart().getLine())!=
				Math.abs(move.getFinish().getColumn()-move.getStart().getColumn()) || 
				move.getMoveX()*move.getMoveY()!=0)
		{return false;}
		return true;
	}
}
