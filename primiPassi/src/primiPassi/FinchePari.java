package primiPassi;

import io.Console;

public class FinchePari {

	public static void main(String[] args) {
			

		//Chiediamo 1 numero per identificare il mese
		System.out.println("Inserisci un numero");
						
		int numero = Console.leggiInt();
		
		while(numero % 2 == 1) {
			
			System.out.println("Inserisci un numero");
			
			numero = Console.leggiInt();
			
		}
		
	}

}
