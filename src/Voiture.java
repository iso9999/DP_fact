
public abstract class Voiture {
	
	private String modele;
	private int puissance;
	
	public void AfficherDetails()
	{
		System.out.println("Voiture : " + modele + ", P:" + puissance);
	}

	public Voiture(String modele, int puissance) {
		super();
		this.modele = modele;
		this.puissance = puissance;
	}
	
}
