package miniprojetS2;

/**
 * represent the chess game
 * @author costel
 *
 */	
// TODO rename class (not compliant with naming conventions) (done)
public class Chessgame
{
	/**
	 * counter for the loop play to know who will play ( peer for player 1 and odd for player 2)
	 */
	private int counter;
	
	// TODO fix comment (ask for advice) (done)
	 /**
	  * creation of 2 players and the grid.
	  */
	public Chessgame(String gamer1, String gamer2)
	{
		// TODO think about it: a constructor is supposed to initialize fields. Where are fields?)
		Player player1 = new Player(gamer1);
		Player player2= new Player(gamer2);
		Grid grid[][]=new Grid[8][8];
		
	}

	// TODO detail comment (write algorithm using an algorithmic-like syntax) (done)
	/**
	 * while anyplayer don't surrend or lose the game continue and each player play .
	 */
	public void play()
	{
		
		while ((!echecEtMat()) || (!surrend()))
		{
			if (counter%2==0)
				player1.move();
			else 
				player2.move();
			counter++;
		}
	}
	
	private boolean surrend()
	{
		return false;
	}
	
	private boolean echecEtMat()
	{
		return false;
	}
}
