package ex2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerTool = new Scanner(System.in);
        System.out.println("Scrivi un numero:");
        int inputInt = Integer.parseInt(scannerTool.nextLine());
        switchExercise(inputInt);

        scannerTool.close();
    }

    public static void switchExercise(int inputInt) {
        String selectedNumber = switch (inputInt) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "Errore, numero fuori intervallo";
        };
        System.out.println(selectedNumber);
    }
}
