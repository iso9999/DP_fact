
public abstract class Moto {
	private String modele;
	
	public void AfficherDetails()
	{
		System.out.println("Moto : " + modele);
	}

	public Moto(String modele) {
		super();
		this.modele = modele;
	}
	
	
}
