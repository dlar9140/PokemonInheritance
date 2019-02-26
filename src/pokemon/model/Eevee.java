package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee(int num, String pokename)
	{
		super(num,pokename);
	}
	
	
	public void bite()
	{
		System.out.println("CHOMP");
	}
}
