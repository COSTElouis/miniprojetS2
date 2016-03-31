package miniprojetS2;
/**
 * 
 * @author costel
 * class which creating a Tower piece.
 */
public class Tower extends Piece
{

	public Tower(String nom, int color)
	{
		super(nom, color);
	}

	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (move.getMoveX()*move.getMoveY()!=0)
		{return false;}
		return true;
	}

}
