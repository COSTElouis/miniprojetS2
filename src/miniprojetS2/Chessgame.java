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
	Grid grid= new Grid();
	// TODO detail comment (write algorithm using an algorithmic-like syntax) (done)
	/**
	 * while anyplayer don't surrend or lose the game continue and each player play .
	 */
	public void play(String gamer1, String gamer2)
	{
		sc = new Scanner(System.in);
		
		
		grid.initialisation();
		System.out.println(grid.toString());
		while (!echecEtMat())
		{
			
			if (counter%2==0)
			{
				coordonate();
				
				piece=grid.getCells(oldCellLine,oldCellColumn).getPiece();
				while (!piece.isValid(new Move(new Position(oldCellLine, oldCellColumn),new Position(newCellLine, newCellColumn))) &&
						!collision(new Move(new Position(oldCellLine, oldCellColumn),new Position(newCellLine, newCellColumn))))
				{
					coordonate();
				}
				grid.getCells(oldCellLine,oldCellColumn).setPiece(null);
				grid.getCells(newCellLine,newCellColumn).setPiece(piece);
				System.out.println(grid.toString());
			}
			else
			{ 
				coordonate();
				
				piece=grid.getCells(oldCellLine,oldCellColumn).getPiece();
				while (!piece.isValid(new Move(new Position(oldCellLine, oldCellColumn),new Position(newCellLine, newCellColumn))))
				{
					coordonate();
					System.out.println(grid.toString());
				}
				grid.getCells(oldCellLine,oldCellColumn).setPiece(null);
				grid.getCells(newCellLine,newCellColumn).setPiece(piece);
				System.out.println(grid.toString());
			}
				counter++;
		}
	}
	/**
	 * return true if there is not piece on the road of the piece
	 * and false if there is a piece on the road
	 * @param move
	 * @return
	 */
	public boolean collision(Move move)
	{
		if(move.getMoveX()==0)
		{
				int i=0;
				while(grid.getCells(move.getStart().getLine(),move.getStart().getColumn()+i).getPiece()==null &&  i<move.getMoveY());
				{
					i++;
				}
				if (i+1==move.getMoveY())
				{
					if (grid.getCells(move.getStart().getLine(),move.getStart().getColumn()+i+1).getPiece()
					.iseating(grid.getCells(move.getFinish().getLine(),move.getFinish().getColumn()).getPiece()))
					{
						return true;
					}
					if ((grid.getCells(move.getStart().getLine(),move.getStart().getColumn()+i+1).getPiece()==null))
					{
						return true;
					}
					return false;
				}
		}
		if(move.getMoveY()==0)
		{
				int i=0;
				while(grid.getCells(move.getStart().getLine()+i,move.getStart().getColumn()).getPiece()==null &&  i<move.getMoveX());
				{
					i++;
				}
				if (i+1==move.getMoveX())
				{
					if (grid.getCells(move.getStart().getLine()+i+1,move.getStart().getColumn()).getPiece()
					.iseating(grid.getCells(move.getFinish().getLine(),move.getFinish().getColumn()).getPiece()))
					{
						return true;
					}
					if ((grid.getCells(move.getStart().getLine()+i+1,move.getStart().getColumn()).getPiece()==null))
					{
						return true;
					}
					return false;
				}
		}
		else
		{
			int i=0;
			while(grid.getCells(move.getStart().getLine()+i,move.getStart().getColumn()+i).getPiece()==null &&  i<move.getMoveX() && i<move.getMoveY());
			{
				i++;
			}
			if (i+1==move.getMoveX() && i+1==move.getMoveY())
			{
				if (grid.getCells(move.getStart().getLine()+i+1,move.getStart().getColumn()+i+1).getPiece()
				.iseating(grid.getCells(move.getFinish().getLine(),move.getFinish().getColumn()).getPiece()))
				{
					return true;
				}
				if ((grid.getCells(move.getStart().getLine()+i+1,move.getStart().getColumn()+i+1).getPiece()==null))
				{
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	/**
	 * put in attributs all of the position of the piece (old and new)
	 */
	public void coordonate()
	{
		oldCellLine=sc.nextInt();
		oldCellColumn=sc.nextInt();
		newCellLine=sc.nextInt();
		newCellColumn=sc.nextInt();
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
