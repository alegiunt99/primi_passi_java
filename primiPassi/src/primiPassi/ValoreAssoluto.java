package primiPassi;

import io.Console;

public class ValoreAssoluto {
	
	public static void main(String[] args) {
		
		//Chiediamo 1 numero
		System.out.println("Inserisci 1 numero");
						
		int numero = Console.leggiInt();
	
		
		System.out.println(numero);
		
		// se il numero è negativo, stampare il valore assoluto
		if(numero < 0){
			System.out.println("il valore assoluto di " + numero + " e' " + Math.abs(numero));
		}
		
	}
}
