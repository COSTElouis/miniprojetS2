package miniprojetS2;

// TODO fix comment
/**
 * class which creating a Tower piece.
 * 
 * @author costel
 * 
 */
public class Tower extends Piece
{
	// TODO write comment
	public Tower(String nom, int color)
	{
		super(nom, color);
	}

	// TODO write comment
	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (move.getMoveX() * move.getMoveY() != 0)
		{
			return false;
		}
		return true;
	}

}
