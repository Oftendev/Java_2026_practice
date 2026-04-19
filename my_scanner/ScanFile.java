package my_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {
    public static void main(String[] args) {
        File file = new File("my_scanner/input.txt");

        // try-with-resources гарантирует закрытие Scanner
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}