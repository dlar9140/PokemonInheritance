package pokemon.model;

public abstract class Jigglypuff extends Pokemon implements Fairy 
{

	public Jigglypuff (int num, String pokename)
	{
		super(num, pokename);
	}
	
	public void sleep()
	{
		System.out.println("Zzzzzzz");
	}
	
	public abstract boolean isFloating();
	{
		return false()
	}

}
