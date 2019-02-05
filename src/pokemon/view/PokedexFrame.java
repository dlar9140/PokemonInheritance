package pokemon.view;

import pokemon.controller.PokedexController;
import pokemon.view.PokedexPanel;
 
public class PokedexFrame
{
	private PokedexController appController;
	private PokedexPanel appPanel;
	
	public PokedexFrame(PokedexController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new PokedexPanel(appController);
	}
	
	private void setupFrame()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setuoListeners()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
}
