package miniprojetS2;

// TODO fix comment (what kind of game?)
/**
 * represents the game 
 * @author costel
 *
 */
// TODO rename class (what king of game?)
public class Game
{
	
	// TODO fix comment (ask for advice)
	/**
	 * represente a game 
	 */
	public Game()
	{
		// TODO think about it: a constructor is supposed to initialize fields. Where are fields?)
	}
	
	// TODO detail comment (algorithm)
	/**
	 * Play the game 
	 */
	public void play()
	{
		Player player1 = new Player("bob");
		Player player2= new Player("Michou");
		
		Grid grid[][]=new Grid[8][8];
		
		while (echecEtMat()==false)
		{
			player1.move();
			player2.move();
		}
	}
	
	private boolean echecEtMat()
	{
		return false;
	}
}
