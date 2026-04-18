package loops.practice_2;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // пропускаем чётные числа
            }
            System.out.println("Odd i = " + i);
        }
    }
}
