package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(int argent, String nom) {
		super(argent, "thé", nom);
	}
	
	public int seFaireExtorquer()
	{
		this.perdreArgent(this.getArgent()) ;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return 0;
	}
	
	public void recevoir(int argent, Ronin ronin)
	{
		this.gagnerArgent(argent);
		ronin.perdreArgent(argent);
		parler("Je vous remercie alors avec déférence");
	}
	
	
	
	

}
