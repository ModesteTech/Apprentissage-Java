package net.boucle_java;

public class Boucle_java {

	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			System.out.println("Ceci est tour de boucle numero "+i);
		}
		int[] notes={10,12,15};
		int calcul=0;
		for(int note:notes){
			calcul+=note;
		}
		System.out.println("La moyenne est : "+calcul/notes.length);
		int i=0;
		while(i<10){
			System.out.println(i);
			i+=2;
		}
		do{
			System.out.println("Nous somme dans la boucle do while "+i);
			i+=5;
		}while(i!=20);
	}
    System.out.println("Salut");
} 