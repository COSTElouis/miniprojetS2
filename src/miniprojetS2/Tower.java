package miniprojetS2;

// TODO fix comment (done)
/**
 * class which creating a Tower piece.
 * @author costel
 * 
 */
public class Tower extends Piece
{
	// TODO write comment (done)
	/**
	 * constructor of the class Tower
	 * @param nom
	 * @param color
	 */
	public Tower(String nom, int color)
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
		if (move.getMoveX() * move.getMoveY() != 0)
		{
			return false;
		}
		return true;
	}

}
