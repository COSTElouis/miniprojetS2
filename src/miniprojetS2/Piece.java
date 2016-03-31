package miniprojetS2;

public class Piece
{
	// Name of the piece
	private String nom;
	// Color of the piece
	private int color;
	
	
	public Piece(String nom, int color)
	{
		this.nom = nom;
		this.color = color;
	}
	
	public boolean isValid(Move move)
	{
		//TODO when method collision is finish implement the condition 
		if (move.getMoveX()==0 && move.getMoveY()==0 || move.getFinish().getLine()<0 || 
				move.getFinish().getColumn()<0 || move.getFinish().getLine()>8 ||
				move.getFinish().getColumn()>8)
		{
			return false;
		}
		return true;
	}
	
	public String getNom()
	{
		return nom;
	}


	public void setNom(String nom)
	{
		this.nom = nom;
	}


	public int getColor()
	{
		return color;
	}


	public void setColor(int color)
	{
		this.color = color;
	}

	
}


  