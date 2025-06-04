package pl.pp;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class MojaTrzynastaAplikacja {
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
        outputPath = Paths.get(scanner.nextLine());

        try {
            List<String> lines = Files.readAllLines(inputPath, Charset.defaultCharset());

            long lineCount = lines.size();
            int wordCount = 0;
            Map<String, Integer> wordFrequency = new TreeMap<>();

            for (String line : lines) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.trim().isEmpty()) {
                        word = word.replaceAll("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ]", "").toLowerCase();
                        if (!word.isEmpty()) {
                            wordCount++;
                            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }


            System.out.println("Plik: " + inputPath.getFileName());
            System.out.println("Liczba linii: " + lineCount);
            System.out.println("Liczba słów: " + wordCount);
            System.out.println("Wystąpienia słów:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            List<String> outputLines = new ArrayList<>();
            outputLines.add("Plik: " + inputPath.getFileName());
            outputLines.add("Liczba linii: " + lineCount);
            outputLines.add("Liczba słów: " + wordCount);
            outputLines.add("Wystąpienia słów:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                outputLines.add(entry.getKey() + ": " + entry.getValue());
            }

            Files.write(outputPath, outputLines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Wyniki zapisano do pliku: " + outputPath);

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu lub zapisu pliku.");
            e.printStackTrace();
        }
    }
}
