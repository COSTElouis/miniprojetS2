package miniprojetS2;

//TODO fix comment (this class creates nothing)
/**
 * class player which create a player with his login
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
	
	// TODO fix comment
	/**
	 * create a player who has a login
	 * @param login
	 */
	public Player(String login)
	{
		this.login=login;
	}
	
	// TODO fix comment (general description is missing)
	/**
	 * 
	 * @return login of the player 
	 */
	public String getLogin()
	{
		return this.login;
	}
	
}
