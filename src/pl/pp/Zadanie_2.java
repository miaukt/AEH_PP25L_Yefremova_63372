package pl.pp;
import java.util.Scanner;
public class Zadanie_2 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać swój wiek w latach");
        int years = scanner.nextInt();
        int seconds = years*365*24*60*60;
        System.out.println("Twój wiek w sekundach =" +seconds);
    }

}
