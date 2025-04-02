package pl.pp;
import java.util.Scanner;

public class MojaCzwartaAplikacja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int dolny = scanner.nextInt();
            int gorny = scanner.nextInt();

            if (gorny <= dolny) {
                System.out.println("Done");
                break;
            }

            int suma = 0;
            for (int i = dolny; i <= gorny; i++) {
                suma += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d%n", dolny * dolny, gorny * gorny, suma);
            System.out.print("Enter next set of limits: ");
        }

        scanner.close();
    }
}