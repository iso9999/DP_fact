
public class VoitureEssence extends Voiture{
	
	public VoitureEssence(String modele, int puissance) {
		super(modele, puissance);
		// TODO Auto-generated constructor stub
	}

	public void AfficherDetails()
	{
		super.AfficherDetails();
		System.out.println("Essence");
	}
}
