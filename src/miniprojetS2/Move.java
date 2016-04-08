package miniprojetS2;

// TODO write comment
public class Move
{
	// TODO write comment
	private int moveX;

	// TODO write comment
	private int moveY;

	// TODO write comment
	private Position start;
	// TODO write comment
	private Position finish;

	// TODO write comment
	public Move(Position start, Position finish)
	{
		this.start = start;
		this.finish = finish;
		this.moveX = finish.getLine() - start.getLine();
		this.moveY = finish.getColumn() - start.getColumn();
	}

	// TODO write comment
	public int getMoveX()
	{
		return moveX;
	}

	// TODO write comment
	public int getMoveY()
	{
		return moveY;
	}

	// TODO write comment
	public Position getStart()
	{
		return start;
	}

	// TODO write comment
	public Position getFinish()
	{
		return finish;
	}

}
