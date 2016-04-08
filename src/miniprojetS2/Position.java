package miniprojetS2;

// TODO let objects of this class be immutable
// TODO write comment (done)
/**
 * class who represent the position of a pawn
 * @author costel
 *
 */
public class Position
{
	// TODO field should not be public (done)
	// TODO write "javadoc" comment (done)
	/**
	 * field who represent the abscissa of the position
	 */
	private int line;

	// TODO field should not be public (done)
	// TODO write "javadoc" comment (done)
	/**
	 *  field who represent the orderly
	 */
	private int column;

	// TODO write comment (done)
	/**
	 * the constructor of the class position
	 * @param line
	 * @param column
	 */
	public Position(int line, int column)
	{
		this.line = line;
		this.column = column;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the line of the object called
	 * @return the line
	 */
	public int getLine()
	{
		return this.line;
	}

	// TODO write comment (done)
	/**
	 * method which permit to set the field line of the object called
	 * @param line
	 */
	public void setLine(int line)
	{
		this.line = line;
	}

	// TODO write comment (done)
	/**
	 * method which permit to get the column of the object called
	 * @return the column
	 */
	public int getColumn()
	{
		return this.column;
	}

	// TODO write comment (done)
	/**
	 * method which permit to set the field column of the object called
	 * @param column
	 */
	public void setColumn(int column)
	{
		this.column = column;
	}

}
