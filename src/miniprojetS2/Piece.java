package miniprojetS2;

public class Piece
{
	// TODO write "javadoc" comment (not javadoc style) (done)
	/**
	 *  Name of the piece
	 */
	// TODO rename field (done)
	private String name;

	// TODO write "javadoc" comment (not javadoc style) (done)
	/**
	 *  Color of the piece
	 */
	private int color;
	
	
	// TODO write comment (done)
	/**
	 * the constructor of the class Piece
	 * @param name
	 * @param color
	 */
	public Piece(String name, int color)
	{
		this.name = name;
		this.color = color;
	}

	// TODO write comment (done)
	/**
	 * the definition of method who return true if the movement is in the grid
	 * @param move
	 * @return
	 */
	public boolean isValid(Move move)
	{
		//TODO when method collision is finish implement the condition 
		if (move.getMoveX()==0 && move.getMoveY()==0 || move.getFinish().getLine()<0 || 
				move.getFinish().getColumn()<0 || move.getFinish().getLine()>8 ||
				move.getFinish().getColumn()>8)
		{
			return false;
		}
		return true;
	}
	
	
	/**
	 * check if the piece color of the end cell is the same of the piece that we moved
	 * if it the fact you can eat the piece else you can eat the piece
	 * @param piecestanding
	 * @return
	 */
	public boolean iseating(Piece piecestanding)
	{
		if (piecestanding==null)
			return false;
		if (this.color==piecestanding.color)
			return false;
		return true;
	}
	
	// TODO write comment(done)
	// TODO rename method (done)
	/**
	 * method which permit to get the name of the object called
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	// TODO write comment (done)
	/**
	 * method which permit to set the field name of the object called
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the color of the object called
	 * @return the color
	 */
	public int getColor()
	{
		return color;
	}

	// TODO write comment (done)
	/**
	 * method which permit to set the field color of the object called
	 * @param color
	 */
	public void setColor(int color)
	{
		this.color = color;
	}

	
}


  