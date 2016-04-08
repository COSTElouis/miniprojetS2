package miniprojetS2;
/**
 * class which creating a Knight piece
 * @author costel
 *
 */

public class Knight extends Piece
{	
	/**
	 * constructor of the class Knight
	 * @param nom
	 * @param color
	 */
	public Knight(String nom, int color)
	{
		super(nom, color);
	}
	
	/**
	 * the redefinition of method "isValid" of Piece superclass
	 * who return true if the movement of the Knight matches with chess game rules 
	 */
	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (Math.abs(move.getFinish().getLine())+Math.abs(move.getFinish().getColumn())!=3 || move.getMoveX()==0 || move.getMoveY()==0)
		{return false;}
		return true;
	}

}

