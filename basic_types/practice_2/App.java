package basic_types.practice_2;

import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\u041a\u0430\u0440\u0438\u043c");
        Scanner scan = new Scanner(System.in, Charset.forName("CP866"));
        scan.close();
    }
}
