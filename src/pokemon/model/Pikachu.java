package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu(int num, String pokename)
	{
		super(num,pokename);
	}
	
	public void shock()
	{
		System.out.println("pii ... kaa ... CHUUUUUUUUU!!!");
	}
	
	public int shockLevel()
	{
		return 123456789;
	}

	@Override
	public boolean isStatic()
	{
		// TODO Auto-generated method stub
		return false;
	}
}