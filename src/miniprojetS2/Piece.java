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


  