package pl.pp;

import java.util.Scanner;

public class Zadanie3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę dni (lub wartość niedodatnią, aby zakończyć): ");
            int dni = scanner.nextInt();

            if (dni <= 0) {
                System.out.println("Koniec programu.");
                break;
            }

            int tygodnie = dni / 7;
            int pozostaleDni = dni % 7;

            System.out.println(dni + " dni to " + tygodnie + " tygodnie i " + pozostaleDni + " dni");
        }

        scanner.close();
    }
}