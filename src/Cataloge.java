
public class Cataloge {
	private Moto moto;
	private Voiture voiture;
	private FabriqueAbsraite fabriqueAbsraite;
	
	public void creeMoto(String modele)
	{
		this.moto = fabriqueAbsraite.creeMoto(modele);
	}
	
	public void creeVoiture(String modele, int puissance)
	{
		this.voiture = fabriqueAbsraite.creeVoiture(modele, puissance);
	}

	public Cataloge() {
	}

	public FabriqueAbsraite getFabriqueAbsraite() {
		return fabriqueAbsraite;
	}

	public void setFabriqueAbsraite(FabriqueAbsraite fabriqueAbsraite) {
		this.fabriqueAbsraite = fabriqueAbsraite;
	}

	public Moto getMoto() {
		return moto;
	}

	public Voiture getVoiture() {
		return voiture;
	}
	
	
}
