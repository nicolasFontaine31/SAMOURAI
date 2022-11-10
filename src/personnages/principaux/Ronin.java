package personnages.principaux;



import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur;

	public Ronin(int argent, String boisson, String nom) {
		super(argent, boisson, nom);
		this.honneur = 1;
	}
	
	public void donner(int argent, Commercant commercant)
	{
		if (argent > this.getArgent())
		{
			parler("Je n'ai pas assez d'argents");
		}
		else
		{
			this.perdreArgent(argent);
			commercant.gagnerArgent(argent);
			parler("Tiens Marchant voilà "+argent+" sous.");
			commercant.parler("Je te remercie généreux donateur!");
		}
	}
	
	public void provoquer(Yakusa yakuza)
	{
		int honneurRonin = this.honneur;
		int reputYaku=yakuza.getReputation();
		if ((2*honneurRonin)>reputYaku)
			//ronin gagne
		{
			this.gagnerArgent(yakuza.getArgent());
			yakuza.perdreArgent(this.getArgent());
			
		}
		else
		{
			
			yakuza.gagnerArgent(this.getArgent());
			this.perdreArgent(yakuza.getArgent());
		}
	}
	


}
