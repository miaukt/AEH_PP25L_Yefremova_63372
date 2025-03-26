package pl.pp;

import java.util.Scanner;

public class Zadanie3_3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Wprowadź temperaturę w stopniach Fahrenheita (lub -1 aby zakończyć): ");

                if (!scanner.hasNextDouble()) {
                    System.out.println("Błąd! Proszę wprowadzić wartość numeryczną.");
                    scanner.next();
                    continue;
                }

                double fahrenheit = scanner.nextDouble();

                if (fahrenheit == -1) {
                    System.out.println("Zakończenie programu...");
                    break;
                }

                double celsius = (fahrenheit - 32) / 1.8;
                double kelvin = celsius + 273.15;

                System.out.println("Fahrenheit: " + fahrenheit + "\nCelsius: " + celsius + "\nKelvin: " + kelvin);
            }

            scanner.close();
        }
    }
