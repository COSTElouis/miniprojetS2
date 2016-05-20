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
	private Piece piece;
	/**
	 * counter for the loop play to know who will play ( peer for player 1 and odd for player 2)
	 */
	private int counter;
	/**
	 * create attribute for the key entry
	 */
	private static Scanner sc;
	
	private int oldCellLine;
	

	private int oldCellColumn;
	private int newCellLine;
	private int newCellColumn;
	
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
				coordonate();
				
				piece=Grid.cells[oldCellLine][oldCellColumn].getPiece();
				while (!piece.isValid(new Move(new Position(oldCellLine, oldCellColumn),new Position(newCellLine, newCellColumn))))
				{
					coordonate();
				}
				Grid.cells[oldCellLine][oldCellColumn].setPiece(null);
				Grid.cells[newCellLine][newCellColumn].setPiece(piece);
				System.out.println(grid.toString());
			}
			else
			{ 
				coordonate();
				
				piece=Grid.cells[oldCellLine][oldCellColumn].getPiece();
				while (!piece.isValid(new Move(new Position(oldCellLine, oldCellColumn),new Position(newCellLine, newCellColumn))))
				{
					coordonate();
					System.out.println(grid.toString());
				}
				Grid.cells[oldCellLine][oldCellColumn].setPiece(null);
				Grid.cells[newCellLine][newCellColumn].setPiece(piece);
				System.out.println(grid.toString());
			}
				counter++;
		}
	}

	public void coordonate()
	{
		oldCellLine=sc.nextInt();
		oldCellColumn=sc.nextInt();
		newCellLine=sc.nextInt();
		newCellColumn=sc.nextInt();
	}
	
	private boolean surrend()
	{
		return false;
	}
	
	private boolean echecEtMat()
	{
		return false;
	}
	public int getOldCellLine()
	{
		return oldCellLine;
	}

	public int getOldCellColumn()
	{
		return oldCellColumn;
	}

	public int getNewCellLine()
	{
		return newCellLine;
	}

	public int getNewCellColumn()
	{
		return newCellColumn;
	}
}
