package miniprojetS2;

public class Piece
{
	// TODO write "javadoc" comment (not javadoc style)
	// Name of the piece
	// TODO rename field
	private String nom;

	// TODO write "javadoc" comment (not javadoc style)
	// Color of the piece
	private int color;
	
	
	// TODO write comment
	public Piece(String nom, int color)
	{
		this.nom = nom;
		this.color = color;
	}

	// TODO write comment
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
	
	// TODO write comment
	// TODO rename method
	public String getNom()
	{
		return nom;
	}

	// TODO write comment
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	// TODO write comment
	public int getColor()
	{
		return color;
	}

	// TODO write comment
	public void setColor(int color)
	{
		this.color = color;
	}

	
}


  