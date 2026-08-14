package POO;

public class Ville {
	protected String nom_ville;
	protected String nom_pays;			//VARIABLES D'INSTANCES ACCESIBLES PARTOUTS DANS LE CODE
	protected int nombres_habitants;
	protected static int nbrs_instances=0;
	
public String getNom_ville() {
		return nom_ville;
	}

	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville; //le mot cle this est utilise pour differencier les variables d'instances aux parametres
	}

	public String getNom_pays() {
		return nom_pays;
	}

	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}

	public int getNombres_habitants() {
		return nombres_habitants;
	}

	public void setNombres_habitants(int nombres_habitants) {
		this.nombres_habitants = nombres_habitants;
	}

public Ville(){ 		//Creation d'un constructeur, si je ne le fait pas un est cree par defaut
		System.out.println("Creation d'un constructeur");
		this.nom_ville="xyz"; // Comme c'est un constructeur par defaut les parametres seront "null" pour les chaines de caracteres et "0" pour les entiers
		this.nom_pays="Inconnu";
		this.nombres_habitants=0;
	}
	
public Ville(String nom,String pays, int nombres){
	System.out.println("Creation ville avec parametres");
	this.nom_ville=nom;
	this.nom_pays=pays;
	this.nombres_habitants=nombres;
	nbrs_instances++;
	
}

public static int getNbrs_instances() {
	return nbrs_instances;
}

public String description(){
	return this.nom_ville+" est une ville du "+this.nom_pays+" qui a "+this.nombres_habitants+" d'habitants";
}
	
	
	
}
