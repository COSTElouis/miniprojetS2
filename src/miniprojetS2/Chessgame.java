package miniprojetS2;

import java.util.Scanner;

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
	/**
	 * create attribute for the key entry
	 */
	private static Scanner sc;
	
	// TODO fix comment (ask for advice) (done)
	 /**
	  * creation of 2 players and the grid.
	  */
	public Chessgame()
	{
		// TODO think about it: a constructor is supposed to initialize fields. Where are fields?)
				
	}

	// TODO detail comment (write algorithm using an algorithmic-like syntax) (done)
	/**
	 * while anyplayer don't surrend or lose the game continue and each player play .
	 */
	public void play(String gamer1, String gamer2)
	{
		sc = new Scanner(System.in);
		
		Grid grid= new Grid();
		grid.initialisation();
		System.out.println(grid.toString());
		while ((!echecEtMat()) || (!surrend()))
		{
			
			if (counter%2==0)
			{
				new Move(new Position(sc.nextInt(),sc.nextInt()),new Position(sc.nextInt(),sc.nextInt()));
				System.out.println(grid.toString());
			}
			else
			{ 
				new Move(new Position(sc.nextInt(),sc.nextInt()),new Position(sc.nextInt(),sc.nextInt()));
				System.out.println(grid.toString());
			}
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
