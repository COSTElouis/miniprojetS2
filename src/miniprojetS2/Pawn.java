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
	 * each pawn has a name like tower, queen,king ....
	 */
	private String name;
	/**
	 * each pawn has a color black or white
	 */
	private String color;
	/**
	 * create a pawn with a abscissa and an orderly
	 * @param the name of the pawn
	 * @param the color of the pawn
	 * @param x	of a pawn
	 * @param y	of a pawn
	 */
	public Pawn(String name, String color,int x,int y)
	{
		this.name=name;
		this.color=color;
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
