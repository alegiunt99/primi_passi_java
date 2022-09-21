package primiPassi;

import io.Console;

public class VocaleConsonante {

	public static void main(String[] args) {
		//Chiediamo 1 lettera dell'alfabeto
		System.out.println("Inserisci solo 1 lettera dell'alfabeto");
						
		char lettera = Console.leggiChar();
		
		// creo una condizione Switch per definire se sia vocale o consonante
		switch(lettera) {
		
			case 'a':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'A':
				System.out.println(lettera + " è una vocale!");
				break;
			case 'e':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'E':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'i':
				System.out.println(lettera + " è una vocale!");
				break;
	
			case 'o':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'O':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'u':
				System.out.println(lettera + " è una vocale!");
				break;
				
			case 'U':
				System.out.println(lettera + " è una vocale!");
				break;
				
			default:
				System.out.println(lettera + " è una consonante!");
		}

		
		
	}

}
