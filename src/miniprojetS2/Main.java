// TODO update README.md (what/who)
package miniprojetS2;

//TODO rename class (not compliant with coding conventions)(done)
/**
 * @author costel
 * class which execute the game
 */
public class Main
{
	// TODO write comment (done)
	/**
	 * signature of the methode main
	 * @param args
	 */
	public static void Main(String[] args)
	{
		
		// TODO javadoc syntax is not allowed for implementation comment (done)
		
		/**
		 * creation of new grid
		 */
		
		Grid grid= new Grid();
		
		// TODO think about it: it will not display anything on console (done)
		/**
		 * creation of a new game which is ready to play
		 */
		new Chessgame("yoyo","loulou").play();

	}

}
