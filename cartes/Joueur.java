package cartes;

import java.util.ArrayList;

public class Joueur
{
	private ArrayList<Carte> cartes;
	
	public Joueur()
	{
		this.cartes = new ArrayList<Carte>();
	}
	
	public Carte tirer()
	{
		Carte c =  cartes.get(0);
		this.retirer();
		return c;
	}
	
	public void ajouter(Carte c)
	{
		cartes.add(c);
	}
	
	public void ajouter(ArrayList<Carte> liste)
	{
		for(Carte c : liste)
			cartes.add(c);
	}
	
	public void retirer()
	{
		cartes.remove(0);
	}
	
	public int getPoints()
	{
		return this.cartes.size();
	}
	
	public void melanger(){
		
	}
}
