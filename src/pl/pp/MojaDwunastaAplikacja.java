package pl.pp;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class MojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path inputPath = null;
        Path outputPath = null;

        String userDirectory = System.getProperty("user.dir");
        System.out.println("Bieżący katalog to:");
        System.out.println(userDirectory);

        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String input = scanner.nextLine();
            inputPath = Paths.get(input);
            if (Files.exists(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String output = scanner.nextLine();
        outputPath = Paths.get(output);

        try {
            long lineCount = Files.lines(inputPath).count();

            System.out.println("Liczba linii w pliku \"" + inputPath.getFileName() + "\": " + lineCount);

            String result = "Plik: " + inputPath.getFileName() + "\nLiczba linii: " + lineCount;

            Files.writeString(outputPath, result, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Wynik zapisany do pliku: " + outputPath.toString());
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas przetwarzania plików.");
            e.printStackTrace();
        }
    }
}
