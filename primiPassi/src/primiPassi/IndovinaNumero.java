package primiPassi;

import io.Console;

public class IndovinaNumero {

	public static void main(String[] args) {
		
		// numero da indovinare
		
		int numeroDaIndovinare = 34;
		
		// facciamo indovinare il numero all'user
		
		System.out.println("Scrivi un numero e indovina!");
		
		int numeroUser = Console.leggiInt();
		
		// lo facciamo provare finchè non indovina
		while(!(numeroUser == numeroDaIndovinare)) {
			
			System.out.println("Peccato! Ritenta ");
			
			numeroUser = Console.leggiInt();
			
		}
		
		
		System.out.println(numeroUser);
			
		
		
		
		

	}

}
