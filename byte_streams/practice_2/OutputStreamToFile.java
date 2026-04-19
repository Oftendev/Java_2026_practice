package byte_streams.practice_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamToFile {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("byte_streams/practice_2/out.txt")) {
            fos.write(65); // записывает байт 65 ('A')
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}