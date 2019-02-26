package pokemon.model;
import javax.swing.JOptionPane;

public class Kirby extends Pokemon implements Fairy
{

	public Kirby()
	{
		super(9999, "Kirby");
	}
	
	public Kirby(String name)
	{
		super(9999, name);
	}
	
	public Kirby(int num, String name)
	{
		super(num, name);
	}
	
	public void swallow()
	{
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "Swallowed opponant!");
		}
	}

}
