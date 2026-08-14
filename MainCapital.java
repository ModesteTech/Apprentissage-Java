package POO;

public class MainCapital {

	public static void main(String[] args) {
		Capital cap0=new Capital();
		System.out.println(cap0.description());
		
		Capital cap1=new Capital("DAKAR",345000,"SENEGAL","RENNAISSANCE");
		System.out.println(cap1.description());
		
		Ville[] tableau=new Ville[5];
		String[] tab={"BAFFOUSSAM","BUEA","SANAGA","PARIS","LONDRES"};
		int[] tab1={123000,345000,23000,2500000,4000000};
		
		for(int i=0;i<5;i++){
			if(i<3){
				tableau[i]=new Ville(tab[i],"CAMEROUN",tab1[i]);
			}else{
				tableau[i]=new Capital(tab[i],tab1[i],"FRANCE","TOUR EIFFEL");
			}
		}
		
		for(Ville ville:tableau){ //
			System.out.println(ville.description());
			
		}
		
		
		
		
		
		
		
	}

}
