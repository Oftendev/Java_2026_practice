package byte_streams.practice_1;

import java.io.FileInputStream;
import java.io.IOException;


public class InputStreamFromFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("byte_streams/practice_1/input.txt")) {
            int data = fis.read(); // читает один байт 
            System.out.println("Прочитан байт: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}