package pokemon.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pokemon.controller.PokedexController;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox<String> pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		
		numberField = new JTextField("0");
		nameField = new JTextField("My pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon attack level is");
		enhanceLabel = new JLabel("This pokemon enhancement level is");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("pokemon goes here") ;
		
		changeButton = new JButton("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox<String>(); // stubb
		
		setupPanel();
		setupDropdown();
		setupLayout();
		setupListeners();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultCombpBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(pokedexDropdown);
		this.add(changeButton);
		this.add(numberField);
		this.add(nameField);
		this.add(healthField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		this.add(evolveField);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		this.add(imageLabel);
		
		
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}