package miniprojetS2;

public class Knight extends Piece
{
	public Knight(String nom, int color)
	{
		super(nom, color);
	}

	public boolean isValid(Move move)
	{
		super.isValid(move);
		if (Math.abs(move.getFinish().getLine())+Math.abs(move.getFinish().getColumn())!=3 || move.getMoveX()==0 || move.getMoveY()==0)
		{return false;}
		return true;
	}

}

