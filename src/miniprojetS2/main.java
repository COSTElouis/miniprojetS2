package miniprojetS2;

public class main
{

	public static void main(String[] args)
	{
		/**
		 * creation of 2 player: player1 and player2
		 */
		Player player1 = new Player("bob");
		Player player2= new Player("Michou");
		/**
		 * creation of new grid
		 */
		Grid grid= new Grid();
		/**
		 * creation of a new game which is ready to play
		 */
		new Game().play();

	}

}
