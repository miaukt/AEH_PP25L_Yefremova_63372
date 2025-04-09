package pl.pp;
import java.util.Scanner;
public class MojaPiatAplikacja {
    public static void drukuj(char znak, int wiersze, int kolumny) {
            for (int i = 0; i < wiersze; i++) {
                System.out.println(String.valueOf(znak).repeat(kolumny));
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Znak: ");
            char znak = sc.next().charAt(0);

            System.out.print("Wiersze: ");
            int wiersze = sc.nextInt();

            System.out.print("Kolumny: ");
            int kolumny = sc.nextInt();

            drukuj(znak, wiersze, kolumny);
            sc.close();
        }
    }
