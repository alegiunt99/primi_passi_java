package primiPassi;

import io.Console;

public class Saluto {

	public static void main(String[] args) {
		
		//Chiediamo il nome
		
		System.out.println("Come ti chiami?");
		
		String nome = Console.leggiString();
		
		System.out.println("Che ore sono? (0 - 23)");
		
		int orario = Console.leggiInt();	
		
		do {
			//Chiediamo l'orario
			
			System.out.println("scrivi un orario tra 0 e 23!");
			
			orario = Console.leggiInt();	
			
		}while(orario < 0 || orario > 23);
		
		
		
	
		
		//Creiamo la condizione che obbliga l'user a mettere un numero tra 0 e 23

			
			//altrimenti, creiamo la condizione per il saluto personalizzato, in base all'orario inserito
			
			if(orario > 6 && orario < 13) {
				
				// se l'orario va dalle 6 alle 13, scrive Buongiorno
				
				System.out.println("Buongiorno " + nome);
				
			}else if (orario >= 13 && orario < 18 ) {

				// se l'orario va dalle 13 alle 18, scrive Buon pomeriggio
				
				System.out.println("Buon pomeriggio " + nome);
				
			}else if(orario >= 18 && orario <= 22) {

				// se l'orario va dalle 18 alle 22, scrive Buonasera
				
				System.out.println("Buonasera " + nome);
				
			}else {

				// altrimetni, scrive Buonanotte
				
				System.out.println("Buonanotte " + nome);
			}
			
		
		
	}

}
