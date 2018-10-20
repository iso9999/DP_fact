
public class FabriqueVehiculeGasoil implements FabriqueAbsraite{

	
	private static FabriqueVehiculeGasoil instance;
	
	public static FabriqueVehiculeGasoil getInstance()
	{
		if(instance == null)
			instance = new FabriqueVehiculeGasoil();
		return instance;
	}
	@Override
	public Moto creeMoto(String modele) {
		return new MotoGasoil(modele);
	}

	@Override
	public Voiture creeVoiture(String modele, int puissance) {
		return new VoitureGasoil(modele, puissance);
	}

	

}
