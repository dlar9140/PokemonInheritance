package pokemon.controller;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController
{
	private String saveFile = "backup.pokemon";
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	public void start()
	{
		addPokemon();
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Pikachu());
		pokemonList.add(new Eevee());
	}
	
	public void updatePokemon(int index, String [] data)
	
	public String [] getPokeData(int index)
	{
		String [] data = new String [6];
		Pokemon current = pokemonList.get(index);
		data[0] = current.getAttackPoints() + "";
		data[1] = current.getEnhancementModifier() + "";
		data[2] = current.getHealthPoints() + "";
		data[3] = current.getName() + "";
		data[4] = current.isCanEvolve() + "";
		data[5] = current.getNumber() + "";
		return data;
	}
	
	public String[] buildPokedexText()
	{
		String [] numbers = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			numbers[index] = "" + pokemonList.get(index).getNumber();
		}
		return numbers;
	}
	
	public boolean isInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;
		
	}
	
	public boolean isDouble(String mightBeDouble)
	
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type is a decimal value AKA a number witha . in the middle?");
		}
		
		return isValid;
	}
	
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
	}


public void savePokedex()
{
	try
	{
		FileOutputStream saveStream = new FileOutputStream(saveFile);
		ObjectOutputStream output = new ObjectOutputStream(saveStream);
		output.writeObject(pokemonList);
		output.close();
		saveStream.close();
	}
	catch(IOException error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
	}
}

public void loadPokedex()
{
	try
	{
		ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
		FileInputStream inputStream = new FileInputStream(saveFile);
		ObjectInputStream input = new ObjectInputStream(inputStream);
		saved = (ArrayList<Pokemon>) input.readObject();
		input.close();
		inputStream.close();
		pokemonList = saved;
	}
	catch(IOException error)
	{
		JOptionPane.showMessageDialog(appFrame, "No Save file", "Loading Pokemon", JOptionPane.INFORMATION_MESSAGE);
	}
	catch (ClassNotFoundException pokemonError)
	{
		
		JOptionPane.showMessageDialog(appFrame, pokemonError.getMessage(), "Type Error", JOptionPane.ERROR_MESSAGE);
	}
}

}