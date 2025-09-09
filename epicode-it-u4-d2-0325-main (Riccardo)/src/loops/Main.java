package loops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Dammi un numero");
//		int num1 = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Dammi il secondo");
//		int num2 = Integer.parseInt(scanner.nextLine());

		// --------------------------------------------- WHILE --------------------------------------------------
		// Nel WHILE la prima cosa che succede è che viene valutata la condizione. Se questa dovesse essere falsa, allora si salterebbe l'intero loop.
		// Se dovesse essere vera, si entrerebbe nel blocco di codice del loop e si itera fino a che la condizione non diventa falsa. Ciò significa
		// che la variabile che sto valutando all'interno della condizione prima o poi dovrà cambiare valore e far diventare false la condizione, altrimenti
		// CICLO INFINITO

//		while (num2 <= num1 + 15) {
//			num1++;
//			num2 += 4;
//			System.out.println(num2);
//		}

//		int sum = 0;
//		while (true) {
//			System.out.println("Dammi il numero da sommare, premi 0 per uscire");
//			int num = Integer.parseInt(scanner.nextLine());
//			if (num == 0) break; // Il break serve per uscire in maniera forzata dal loop
//			sum += num;
//		}
//
//		System.out.println("La somma è: " + sum);

		// --------------------------------------------- DO-WHILE --------------------------------------------------
		// Nei DO-WHILE viene prima eseguito il blocco di codice e poi valutata la condizione, questo significa che almeno una volta il codice viene eseguito

//		int sum = 0;
//		int num = 0;
//
//		do {
//			System.out.println("Dammi il numero da sommare, premi 0 per uscire");
//			num = Integer.parseInt(scanner.nextLine());
//			sum += num;
//		} while (num != 0);
//
//		System.out.println("La somma è: " + sum);
//


		// --------------------------------------------- FOR --------------------------------------------------
		// I FOR a differenza dei While sono cicli utilizzati principalmente quando sappiamo con anticipo quante ripetizioni vogliamo fare. Per
		// questo si sposano molto bene col mondo degli array (cicla per tutta la lunghezza dell'array)

//		int[] numbers = new int[10];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Inserisci un numero intero");
//			numbers[i] = Integer.parseInt(scanner.nextLine());
//		}

//		System.out.println(Arrays.toString(numbers));
//
//		// Enhanced For, ovvero un'alternativa più compatta al for tradizionale quando abbiamo da lavorare con gli array ma non ci serve accedere ai loro indici
//		for (int currentElement : numbers) {
//			System.out.println(currentElement);
//		}
//
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) break; // Se ho bisogno per qualche ragione, di fare un'uscita anticipata in base ad una condizione posso usare il BREAK
//			System.out.println(i);
//		}
//
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) continue; // continue serve per saltare un'iterazione e passare direttamente alla prossima
//			System.out.println(i);
//		}


		loopesterno:
		// Posso dare un'etichetta al loop esterno, e con il break posso chiedergli di uscire da esso (quindi non dal loop interno)
		for (int i = 0; i < 5; i++) {
			if (i == 3) continue;
			System.out.println("i: " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2) break loopesterno;
				System.out.println("j: " + j);
			}
		}

		scanner.close();

	}
}
