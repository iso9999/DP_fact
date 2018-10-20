
public class VoitureGasoil extends Voiture{
	
	public VoitureGasoil(String modele, int puissance) {
		super(modele, puissance);
		// TODO Auto-generated constructor stub
	}

	public void AfficherDetails()
	{
		super.AfficherDetails();
		System.out.println("Gasoil");
	}
}
