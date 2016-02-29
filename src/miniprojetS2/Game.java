package miniprojetS2;
/**
 * class which create the game 
 * @author costel
 *
 */
public class Game
{
	/**
	 * constructor of an echec game
	 */
	public Game()
	{
		
	}
	/**
	 * methode which run the game
	 */
	public void play()
	{
		while (echecEtMat()==false)
		{
			player1.movePawn();
			player2.movePawn();
		}
	}
	private boolean echecEtMat()
	{
		return false;
	}
}
