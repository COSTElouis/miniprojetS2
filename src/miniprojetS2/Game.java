package miniprojetS2;
/**
 * class represente the game 
 * @author costel
 *
 */
public class Game
{
	/**
	 * represente a game 
	 */
	public Game()
	{
		
	}
	/**
	 * methode which run the game and create 
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
