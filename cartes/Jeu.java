package cartes;

import java.util.ArrayList;
import java.util.Random;

public class Jeu
{
	public static void main(String[] args)
	{
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();

		ArrayList<Carte> cartes = new ArrayList<Carte>();
		int a = 0;

		for (int i = 0; i < 4; i++)
		{
			for (int n = 0; n < 13; n++)
			{
				cartes.add(new Carte(i, n));
			}
		}
		
		
		Random r = new Random();
		int n = 0;
		
		while(cartes.size() > 0)
		{
			n = cartes.size();
			a = r.nextInt(n);
			j1.ajouter(cartes.get(a));
			cartes.remove(a);
			a = r.nextInt(--n);
			j2.ajouter(cartes.get(a));
			cartes.remove(a);
		}
		
		int count = 0;
		ArrayList<Carte> liste = new ArrayList<>();
		
		while(j1.getPoints() < 52 && j2.getPoints() < 52)
		{
			Carte c1 = j1.tirer();
			Carte c2 = j2.tirer();
			liste.add(c1);
			liste.add(c2);
			
			System.out.println("joueur 1 : " + c1);
			System.out.println("joueur 2 : " + c2);
			
			if(c1.estPlusforte(c2) > 0)
			{
				j1.ajouter(liste);
				liste = new ArrayList<>();
				System.out.println("Gagnant : Joueur 1 avec " + j1.getPoints() + " points (j2:" + j2.getPoints() + ")");
			}
			else if(c1.estPlusforte(c2) < 0)
			{
				j2.ajouter(liste);
				liste = new ArrayList<>();
				System.out.println("Gagnant : Joueur 2 avec " + j2.getPoints() + " points (j1:" + j1.getPoints() + ")");
			}
			else{
				System.out.println("Les cartes sont egales : BATAILLE !!!!!");
			}
			count ++;
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		System.out.println("******************************************************************");
		System.out.println("LE JOUEUR " + ((j1.getPoints() >= 52)?"1":"2") + " EST LE GAGNANT DE CETTE BATAILLE AVEC " + count + " COUPS !!!!");
		System.out.println("******************************************************************");

	}
}
