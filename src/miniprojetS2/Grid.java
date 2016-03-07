package miniprojetS2;

public class Grid
{
	private final static int NUMBER_OF_LINES=8;
	private final static int NUMBER_OF_COLUMNS=8;
	private String grid="";
	
	public Grid()
	{

	}
	
	public String toString()
	{
				for (int numberOfLine = 0; numberOfLine < NUMBER_OF_LINES; numberOfLine++)
				{
					for (int numOfColumn = 0; numOfColumn < NUMBER_OF_COLUMNS; numOfColumn++)
					grid += "-";
					
					grid += "\n";
				}
				return grid;
	}
	
	
}
