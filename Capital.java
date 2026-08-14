package POO;

public class Capital extends Ville { //Ville class mere et Capital est une classe fille
	private String monument; // Variable d'instance propre a la classe Capital
	
	public Capital(){ // CONSTRUCTEUR
		super();
		this.monument="Aucun";	
		}
	
	public Capital(String nomVille,int nbrsHabitants, String nomPays,String monument){ // CONSTRUCTEUR
		super(nomVille,nomPays,nbrsHabitants); // SI YU NE METS PAS DE VARIABLES (DANS L'ORDRE) CA APPEL LE CONSTRUCTEUR PAR DEFAUT
		this.monument=monument;
	}// SUPER() POUR FAIRE APPEL AUX VARIABLES ET METHODES DELA CLASSE MERE
	
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	public String description(){
		return super.description()+" et le monument: "+this.monument;
	} // ON A REDEFINIE LA METHODE DESCRIPTION DE LA CLASSE MERE DANS LA CLASSE FILLE CETTEMETHODE S'APPELLE LE POLYMORPHISME
		
	
	
}

