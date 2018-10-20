


public class FabriqueVehiculeEssence implements FabriqueAbsraite{

	private static FabriqueVehiculeEssence instance;
	
	public static FabriqueVehiculeEssence getInstance()
	{
		if(instance == null)
			instance = new FabriqueVehiculeEssence();
		return instance;
	}
	@Override
	public Moto creeMoto(String modele) {
		return new MotoEssence(modele);
	}

	@Override
	public Voiture creeVoiture(String modele, int puissance) {
		return new VoitureEssence(modele, puissance);
	}
}
