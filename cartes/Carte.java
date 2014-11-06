package cartes;

public class Carte
{
	private int couleur, valeur;
	static String tab_couleurs[] =
	{"Carre", "Coeur","Pique","Trefle"};
	static String tab_valeurs[] =
	{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet",
			"Dame", "Roi","As"};

	public Carte(int c, int v)
	{
		this.couleur = c;
		this.valeur = v;
	}

	public int getCouleur()
	{
		return couleur;
	}

	public int getValeur()
	{
		return valeur;
	}

	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}

	public void setValeur(int valeur)
	{
		this.valeur = valeur;
	}

	public boolean equals(Carte obj)
	{
		return (obj != null && obj instanceof Carte && obj.couleur == this.couleur && obj.valeur == this.valeur);
	}
	
	public int estPlusforte(Carte obj)
	{
		int force = 0;
		if(obj != null && obj.valeur < this.valeur)
			force = 1;
		else if(obj != null && obj.valeur > this.valeur)
			force = -1;
		
		return force;
	}
	
	public String toString()
	{
		return tab_valeurs[valeur] + " de " + tab_couleurs[couleur];
	}
	
	public static void main(String[] args)
	{
		Carte c = new Carte(1, 11);
		System.out.println(c);
	}

}
