package primiPassi;

import io.Console;

public class PositivoNegativoNullo {

	public static void main(String[] args) {
		
		//Chiediamo 1 numero
		System.out.println("Inserisci 1 numero");
						
		int numero = Console.leggiInt();
		
		// creiamo una condizione che attesti se il numero inserito è positivo, negativo o uguale a 0
		
		if(numero > 0) {
			
			System.out.println("il numero è POSITIVO");
			
		} else if (numero < 0) {
			
			System.out.println("Il numero è NEGATIVO");
		
		} else {
			
			System.out.println("Il numero è 0");
		}

	}

}
