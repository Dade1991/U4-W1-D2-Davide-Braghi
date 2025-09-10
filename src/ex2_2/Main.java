package ex2_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        whileExercise();
    }

    public static void whileExercise() {
        Scanner scannerTool = new Scanner(System.in);
        while (true) {
            System.out.println("Scrivi una stringa:");
            String inputStr = (scannerTool.nextLine());
            String[] modifiedStr = inputStr.split("");
            System.out.println(Arrays.toString(modifiedStr));
            System.out.println(String.join(",", modifiedStr));
            if (inputStr.equals(":q")) {
                System.out.println("Uscita dal programma");
                break;
            }
        }
    }
}
