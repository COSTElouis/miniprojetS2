package miniprojetS2;

// TODO write comment (done)
/**
 * class which represent a movement of a piece
 * @author costel
 *
 */
public class Move
{
	// TODO write comment (done)
	/**
	 * represent the movement in abscissa of a piece
	 */
	private int moveX;

	// TODO write comment (done)
	/**
	 * represent the movement in orderly of a piece
	 */
	private int moveY;

	// TODO write comment (done)
	/**
	 * the start position of a piece
	 */
	private Position start;
	// TODO write comment (done)
	/**
	 * the finish position of a piece
	 */
	private Position finish;

	// TODO write comment (done)
	/**
	 * the constructor of the class Move
	 * @param start
	 * @param finish
	 */
	public Move(Position start, Position finish)
	{
		this.start = start;
		this.finish = finish;
		this.moveX = finish.getLine() - start.getLine();
		this.moveY = finish.getColumn() - start.getColumn();
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the movement in abscissa of the object called
	 * @return the movement in abscissa
	 */
	public int getMoveX()
	{
		return moveX;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the movement in orderly of the object called
	 * @return the movement in orderly
	 */
	public int getMoveY()
	{
		return moveY;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the start position of the object called
	 * @return the start position
	 */	
	public Position getStart()
	{
		return start;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the finish position of the object called
	 * @return the finish position
	 */
	public Position getFinish()
	{
		return finish;
	}

}
