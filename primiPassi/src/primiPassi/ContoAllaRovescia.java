package primiPassi;

import io.Console;

public class ContoAllaRovescia {
	
	public static void main(String[] args) {
		
		//Chiediamo 1 numero
		System.out.println("Inserisci 1 numero superiore a 0");
						
		int numero = Console.leggiInt();
		
		//creo una condizione che permetta all'user di inserire solo numeri superiori a 0
		if(numero <= 0) {
			
			System.out.println("INSERISCI UN NUMERO POSITIVO, PIU' GRANDE DI 0!");
			
		}
		
		// creo un ciclo, che stampa tutti i numeri dal più grande al più piccolo in base a quello inserito
		
		for(int i = numero; i > 0; i--) {
			
			System.out.println(i);
			
		}
		
	}
}
