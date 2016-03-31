package miniprojetS2;
/**
 * 
 * @author costel
 * class which creating a Queen piece.
 */
public class Queen extends Piece
{

	public Queen(String nom, int color)
	{
		super(nom, color);
	}

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
