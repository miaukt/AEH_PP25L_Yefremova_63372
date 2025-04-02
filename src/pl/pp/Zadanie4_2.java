package pl.pp;

import java.util.Scanner;

public class Zadanie4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Twój wybór: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                scanner.next(); // Oczyszczenie błędnego wejścia
                continue;
            }

            int wybor = scanner.nextInt();
            if (wybor == 5) {
                System.out.println("Koniec programu.");
                break;
            }

            if (wybor < 1 || wybor > 4) {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                continue;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba. Podaj pierwszą liczbę: ");
                scanner.next();
            }
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba. Podaj drugą liczbę: ");
                scanner.next();
            }
            double liczba2 = scanner.nextDouble();

            double wynik = 0;
            switch (wybor) {
                case 1:
                    wynik = liczba1 + liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 4:
                    if (liczba2 == 0) {
                        System.out.println("Błąd: Dzielenie przez zero!");
                    } else {
                        wynik = liczba1 / liczba2;
                        System.out.println("Wynik: " + wynik);
                    }
                    break;
            }
        }

        scanner.close();
    }
}
