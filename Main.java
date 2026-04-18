import java.util.Scanner;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, Charset.forName("CP866")); //В моём случае ввод идёт в кодировке CP866 для кириллицы
        System.out.print("Введите имя: ");
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}