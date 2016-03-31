package miniprojetS2;

public class Move
{
	private int moveX;
	private int moveY;
 
 	private Position start;
 	private Position finish;
 
 	public Move(Position start, Position finish)
 	{
	 this.start=start;
	 this.finish=finish;
	 this.moveX=finish.getLine() - start.getLine();
	 this.moveY= finish.getColumn() - start.getColumn();
 	}

	public int getMoveX()
	{
		return moveX;
	}

	public int getMoveY()
	{
		return moveY;
	}

	public Position getStart()
	{
		return start;
	}

	public Position getFinish()
	{
		return finish;
	}
 	
 	
}
