package personnages.principaux;


import personnages.Humain;

public class Yakusa extends Humain{

	private String clan;
	private int reputation;
	

	public Yakusa(int argent, String boisson, String nom, String clan) {
		super(argent, "thé", nom);
		this.clan = clan;
		this.reputation = 0;
	}
	
	
	void extorquer(Commercant commercant)
	{
		this.gagnerArgent(commercant.getArgent());
		this.reputation +=1;
		commercant.seFaireExtorquer();
		
		parler("J’ai piqué le fric de "+commercant.getNom());
	}



	public String getClan() {
		return clan;
	}

	
	public int getReputation() {
		return reputation;
	}

	public void gagner(Ronin ronin)
	{
		parler("J'ai gagné contre "+ronin.getNom()+"!!!!");
		this.reputation++;
		
	}
	

	
	public int perdre(Ronin ronin)
	{
		if (this.reputation>0)
		{
			parler("J’ai perdu mon duel et mes "+this.argent+" sous, snif...");
			ronin.gagnerArgent(this.argent);
			this.argent = 0;
			this.reputation--;
			return 0;
		}
		else
		{
			return -1;
		}
		
	}


	
	public void direBonjour()
	{
		super.direBonjour();
		parler("Mon clan est celui de "+this.clan+".");
	}
	

}
