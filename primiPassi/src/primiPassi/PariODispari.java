package primiPassi;

import io.Console;

public class PariODispari {

	public static void main(String[] args) {
		
		//Chiediamo 1 numero
		System.out.println("Inserisci 1 numero");
						
		int numero = Console.leggiInt();
		
		// Creo una condizione che definisca se il numero è pari o dispari
		
		
		if(numero % 2 == 0){
			
			//Se il numero inserito, diviso 2, ha resto 0 è pari
			
			System.out.println("Il numero è PARI!");
			
		} else if(numero % 2 == 1) {
			
			//Se il numero inserito, diviso 2, ha resto 1 è Dispari

			System.out.println("Il numero è DISPARI!");
			
		}
		

	}

}
