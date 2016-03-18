package miniprojetS2;

// TODO fix comment (what kind of game?) (done)
/**
 * represent the chess game
 * @author costel
 *
 */
// TODO rename class (what king of game?) (done)
public class Chessgame
{
	
	// TODO fix comment (ask for advice)
	 
	//represent a game 
	 
	public Chessgame()
	{
		// TODO think about it: a constructor is supposed to initialize fields. Where are fields?)
	}
	
	// TODO detail comment (algorithm)
	/**
	 * Play the game 
	 */
	public void play()
	{
		Player player1 = new Player("Yohann");
		Player player2= new Player("Louis");
		
		Grid grid[][]=new Grid[8][8];
		
		while ((!echecEtMat()) || (!abandonner()))
		{
			player1.move();
			player2.move();
		}
	}
	
	private boolean abandonner()
	{
		return false;
	}
	
	private boolean echecEtMat()
	{
		return false;
	}
}
