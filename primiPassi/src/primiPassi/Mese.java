package primiPassi;

import io.Console;

public class Mese {

	public static void main(String[] args) {
		

		//Chiediamo 1 numero per identificare il mese
		System.out.println("Inserisci un mese, in numero (1-12)");
						
		int mese = Console.leggiInt();
		
		while(mese <= 0 || mese > 12) {
			
			System.out.println("Inserisci un numero tra 1 e 12!");
			
			mese = Console.leggiInt();
			
		}
		
		// creo una condizione Switch per definire i mesi e i numeri
				switch(mese) {
				
					case 1:
						System.out.println("Gennaio");
						break;
						
					case 2:
						System.out.println("Febbraio");
						break;
					case 3:
						System.out.println("Marzo");
						break;
						
					case 4:
						System.out.println("Aprile");
						break;
						
					case 5:
						System.out.println("Maggio");
						break;
			
					case 6:
						System.out.println("Giugno");
						break;
						
					case 7:
						System.out.println("Luglio");
						break;
						
					case 8:
						System.out.println("Agosto");
						break;
						
					case 9:
						System.out.println("Settembre");
						break;
						
					case 10:
						System.out.println("Ottobre");
						break;
						
					case 11:
						System.out.println("Novembre");
						break;	
						
					case 12:
						System.out.println("Dicembre");
						break;
	
				}

		
	}

}
