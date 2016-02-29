package miniprojetS2;
/**
 * class pawn
 * @author costel
 *
 */
public class Pawn
{
	/**
	 * abscissa of a pawn
	 */
	private int x;
	/***
	 * orderly of a pawn
	 */
	private int y;
	/**
	 * create a pawn with a abscissa and an orderly
	 * @param x	of a pawn
	 * @param y	of a pawn
	 */
	public Pawn(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Pawn movePawn(Pawn pawn,int x, int y)
	{
		pawn.x=x;
		pawn.y=y;
		return pawn;
	}

}
