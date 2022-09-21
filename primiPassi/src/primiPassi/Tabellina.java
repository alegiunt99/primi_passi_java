package primiPassi;

import io.Console;

public class Tabellina {

	public static void main(String[] args) {
		
		//Chiediamo 1 numero
		System.out.println("Inserisci 1 numero superiore a 0");
						
		int numero = Console.leggiInt();

		//mi assicuro che il numero inserito sia positivo
		
		while(numero < 0) {
			
			System.out.println("inserisci un numero Positivo");
			
			numero =  Console.leggiInt();
			
		}
		
		// creo un ciclo che srampa il numero inserito, moltiplicato per 10 volte e stampando la sua tabellina
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println(numero + " x " + i + " = " + (numero * i));
			
		}
		
		
	}

}
