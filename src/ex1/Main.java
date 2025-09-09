package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerTool = new Scanner(System.in);
        System.out.println("Scrivi una stringa:");
        String inputStr = (scannerTool.nextLine());
        stringaPariDispari(inputStr);

        System.out.println("Scrivi un anno per determinare se sia bisestile:");
        int yearInput = Integer.parseInt(scannerTool.nextLine());
        annoBisestile(yearInput);

        scannerTool.close();
    }

    public static void stringaPariDispari(String inputStr) {
        if (inputStr.length() % 2 == 0) {
            System.out.println("La stringa è pari");
        } else {
            System.out.println("La stringa è dispari");
        }
    }

    public static void annoBisestile(int yearInput) {
        final int var1 = 4;
        final int var2 = 100;
        final int var3 = 400;

        if ((yearInput % var1 == 0) && ((yearInput % var2 == 0) && (yearInput % var3 == 0))) {
            System.out.println("L'anno è bisestile!");
        } else {
            System.out.println("L'anno non è bisestile!");
        }

    }
}
