package multiple_args_methods;

public class MultipleArgsDemo {
    // переменное число парамтров int
    static void print(String prefix, int... nums) {
        System.out.print(prefix + ": ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    // переменное число парамтров String (перегрузка по типу)
    static void print(String prefix, String... strs) {
        System.out.print(prefix + ": ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    // вообще без доп аргументов
    static void print(String prefix) {
        System.out.println(prefix + ": (no params)");
    }

    public static void main(String[] args) {
        print("Numbers", 1, 2, 3); // int... -> "Numbers: 1 2 3"
        print("Strings", "A", "B", "C"); // String... -> "Strings: A B C"
        print("Empty"); // без доп параметров -> "Empty: (no params)"
    }
}