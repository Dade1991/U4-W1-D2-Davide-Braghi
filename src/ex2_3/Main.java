package ex2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerTool = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 100:");
        int inputNumber = Integer.parseInt(scannerTool.nextLine());
        forExercise(inputNumber);
    }

    public static void forExercise(int inputNumber) {

        int[] numbers = new int[100];

        if (inputNumber <= 100) {
            for (int i = inputNumber; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Numero superiore a 100: NON VALIDO.");
        }
    }
}
