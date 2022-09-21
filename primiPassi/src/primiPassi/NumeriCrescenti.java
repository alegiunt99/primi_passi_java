package primiPassi;

import io.Console;

public class NumeriCrescenti {

	public static void main(String[] args) {
		
		//Chiediamo 2 numeri
		System.out.println("Inserisci 1 numero");
						
		int num1 = Console.leggiInt();

		System.out.println("Inserisci 1 numero");
						
		int num2 = Console.leggiInt();
		
		
		// creiamo una condizione in cui verifichiamo quale sia il più piccolo dei 2
		
		if(num1 > num2) {
			
			System.out.println("I numeri in ordine sono: ");
			
			System.out.println(num2 + " - " + num1);
			
		}else if(num1 < num2){
			
			System.out.println("I numeri in ordine sono: ");
			
			System.out.println(num1 + " - " + num2);
			
		} else {
			
			System.out.println("I numeri sono uguali!");
			
		}

	}

}
