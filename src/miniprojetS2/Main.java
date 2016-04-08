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
	 * signature of the method main
	 * @param args
	 */
	public static void Main(String[] args)
	{
		
		// TODO javadoc syntax is not allowed for implementation comment (done)
		
		Grid grid= new Grid();
		
		// TODO do not use javadoc syntax for implementation documentation (done)
		
		new Chessgame("yoyo","loulou").play();

	}

}
