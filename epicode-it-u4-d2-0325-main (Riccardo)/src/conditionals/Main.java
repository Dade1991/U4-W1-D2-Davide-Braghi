package conditionals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// -------------------------------------------- IF-ELSE ------------------------------------------------
		String input = "";
		// if("") System.out.println("La stringa è vuota"); <-- Non siamo in JavaScript, pertanto non esiste il concetto di Truthy/Falsy (Stringa vuota sarebbe Falsy in JS)
		if (input.isEmpty()) System.out.println("La stringa è vuota");

		int x = 1, y = 2, z = 3;

		if (x > y) System.out.println("X è più grande di Y");
		else System.out.println("Y è più grande di X");

		if (!(x > y)) System.out.println("X non è minore di Y");

		// -------------------------------------------- TERNARY ------------------------------------------------
		String text = x > y ? "X è maggiore di Y" : "X è minore di Y";

		String text2 = "";
		if (x > y) text2 = "X è maggiore di Y";
		else text2 = "X è minore di Y";

		int w = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(w);

		// ----------------------------------------- SWITCH-CASE -------------------------------------------------

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Ciao, dammi un voto");
//		int score = Integer.parseInt(scanner.nextLine());
//
//		switch (score) {
//			case 100: {
//				System.out.println("Hai preso il voto massimo");
//				break;
//			}
//			case 90: {
//				System.out.println("Il voto è eccellente");
//				break;
//			}
//			case 80: {
//				System.out.println("Il voto è buono");
//				break;
//			}
//			default:
//				System.out.println("Il voto inserito non è valido");
//				// break; Opzionale se default è messo in fondo
//		}

//		System.out.println("Dammi un numero");
//		int num1 = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Dammi il secondo");
//		int num2 = Integer.parseInt(scanner.nextLine());
//
//		int num3 = num1 > num2 ? --num1 : num2;
//
//		System.out.println("Num 1 è: " + num1);
//		System.out.println("Num 3 è: " + num3);
//
//		switch (num3) {
//			case 10: {
//				System.out.println("è 10");
//				num1++;
//			}
//			case 100: {
//				System.out.println("è 100");
//				num1--;
//				break;
//			}
//			case 1000: {
//				System.out.println("è 1000");
//				num1++;
//			}
//			default: {
//				System.out.println("Nessuno dei precedenti");
//				num1--;
//			}
//		}
//
//		System.out.println("num1? " + ++num1); // Pre-incremento, cioè prima incremento poi leggo il valore
//		System.out.println("num1? " + num1++); // Post-incremento, cioè prima leggo il valore poi incremento
//		System.out.println(num1);

		System.out.println("Inserisci un numero da 1 a 4");
		int num = Integer.parseInt(scanner.nextLine());

		// Enhanced Switch-Case, utile quando dobbiamo assegnare un valore ad una variabile basandoci sulla valutazione di una condizione tramite switch
		String stagione = switch (num) {
			case 1 -> "Estate"; // I break in questo caso sono impliciti quindi non servono!
			case 2 -> "Autunno";
			case 3 -> "Inverno";
			case 4 -> "Primavera";
			default -> "Numero inserito non valido";
		};

		System.out.println(stagione);

		scanner.close();
	}
}
