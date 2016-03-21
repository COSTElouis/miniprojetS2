package miniprojetS2;

public class Position 
{
	// Represent the abscissa
		public  int line;
		// Represent the orderly
		public int column;
		
		
		
	public Position(int line, int column)
		{
			this.line = line;
			this.column = column;
		}



	public int getLine()
	{
		return this.line;
	}



	public void setLine(int line)
	{
		this.line = line;
	}



	public int getColumn()
	{
		return this.column;
	}



	public void setColumn(int column)
	{
		this.column = column;
	}

		
	
}
