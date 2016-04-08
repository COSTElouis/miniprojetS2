package miniprojetS2;

//TODO fix comment (this class creates nothing) (done)
/**
 * class player which represent a player
 * @author costel
 *
 */
public class Player
{
	/**
	 * 
	 * login of a player
	 */
	private String login;
	
	// TODO fix comment (done)
	/**
	 * create a player who has a login
	 * @param login
	 */
	public Player(String login)
	{
		this.login=login;
	}
	
	// TODO fix comment (general description is missing) (done)
	/**
	 * method which permit to get the login of a player
	 * @return login of the player 
	 */
	public String getLogin()
	{
		return this.login;
	}
	
}
