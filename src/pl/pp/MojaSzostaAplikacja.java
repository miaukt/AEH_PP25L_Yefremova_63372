package pl.pp;

import java.util.Scanner;

public class MojaSzostaAplikacja {

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Porównanie metod obliczania silni =====");
        System.out.print("Podaj liczbę całkowitą N: ");
        int N = scanner.nextInt();

        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(N);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(N);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        System.out.println("\n--- Wyniki ---");
        System.out.println("Metoda iteracyjna:");
        System.out.println("Wynik: " + resultIterative);
        System.out.println("Czas wykonania: " + timeIterative + " ns");

        System.out.println("\nMetoda rekurencyjna:");
        System.out.println("Wynik: " + resultRecursive);
        System.out.println("Czas wykonania: " + timeRecursive + " ns");

        System.out.println("\nDziękujemy za skorzystanie z programu!");

        scanner.close();
    }
}
