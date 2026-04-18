package basic_types.practice_6;

public class App {
    public static void main(String[] args) {
        double pi = 3.1415;
        int intPi = (int) pi;
        System.out.println("double to int: " + intPi); // отбрасывает дробную частm
        int code = 65;
        char ch = (char) code;
        System.out.println("int to char: " + ch); // возможно переполнение при int -> char
    }
}