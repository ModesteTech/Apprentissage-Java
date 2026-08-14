package POO;



public class MainVille {
	
	public static void main(String args[]){
		Ville v=new Ville(); 
		Ville v1=new Ville("YAOUNDE","CAMEROUN",3000000);
		System.out.println(v1.description());
		System.out.println(v.description());
		System.out.println(Ville.getNbrs_instances());
		Ville v2=new Ville("DOUALA","CAMEROUN",3000000);
		System.out.println(v2.description());
		System.out.println(Ville.getNbrs_instances());
		Ville v3=new Ville("DAKAR","SENEGAL",3000000);
		System.out.println(v3.description());
		System.out.println(Ville.getNbrs_instances());
		
		
		
		
	}
	
}
