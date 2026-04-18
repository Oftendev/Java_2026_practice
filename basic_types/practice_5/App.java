package basic_types.practice_5;

public class App {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.6;
        int sum1 = b + s;
        System.out.println("byte + short = int: " + sum1);
        long sum2 = i + l;
        System.out.println("int + long = long: " + sum2);
        float sum3 = l + f;
        System.out.println("long + float = float: " + sum3);
        double sum4 = f + d;
        System.out.println("float + double = double: " + sum4);
        double sum5 = b + d;
        System.out.println("byte + double = double: " + sum5);
        char ch = 'A'; 
        int sum6 = ch + 1;
        System.out.println("char + int = int: " + sum6);
    }
}
/* т.е. в случае операций (для простоты рассмотрели на примере суммы) результат имеет тип наибольший из двух операндов (явное преобразование), но также результат может иметь тип больше двух операндов (автоматическое расширение типа для безопасности преобразований) */