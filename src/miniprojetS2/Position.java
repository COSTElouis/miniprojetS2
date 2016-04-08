package miniprojetS2;

// TODO let objects of this class be immutable
// TODO write comment
public class Position
{
	// TODO field should not be public
	// TODO write "javadoc" comment
	// Represent the abscissa
	public int line;

	// TODO field should not be public
	// TODO write "javadoc" comment
	// Represent the orderly
	public int column;

	// TODO write comment
	public Position(int line, int column)
	{
		this.line = line;
		this.column = column;
	}

	// TODO write comment
	public int getLine()
	{
		return this.line;
	}

	// TODO write comment
	public void setLine(int line)
	{
		this.line = line;
	}

	// TODO write comment
	public int getColumn()
	{
		return this.column;
	}

	// TODO write comment
	public void setColumn(int column)
	{
		this.column = column;
	}

}
