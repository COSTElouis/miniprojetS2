package miniprojetS2;

public class Case
{
	private Piece piece;

	public Case()
	{
		
	}
	
	public Case(Piece piece)
	{
		this.piece=piece;
	}
	

	public String toString()
	{
		if (this.piece==null)
		{
			return "¦  ";
		}
	}
}