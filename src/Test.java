
public class Test {

	public static void main(String[] args) {

		Cataloge cataloge = new Cataloge();
		
		FabriqueAbsraite fbe = FabriqueVehiculeGasoil.getInstance();
		cataloge.setFabriqueAbsraite(fbe);
		cataloge.creeMoto("GO");
		cataloge.getMoto().AfficherDetails();
	}

}
