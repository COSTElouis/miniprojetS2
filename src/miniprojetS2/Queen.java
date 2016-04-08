package miniprojetS2;
// TODO fix comment
/**
 * class which creating a Queen piece.
 * @author costel
 * 
 */
public class Queen extends Piece
{
	// TODO write comment
	public Queen(String nom, int color)
	{
		super(nom, color);
	}
	// TODO write comment
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
