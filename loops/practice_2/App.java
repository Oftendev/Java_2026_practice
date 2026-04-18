package loops.practice_2;

public class App {
    public static void main(String[] args) {
        // Пример с break: выход из цикла при достижении условия
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Дошли до 5, прерываем цикл");
                break; // выход из цикла полностью
            }
            System.out.println("i = " + i);
        }

        // Пример с continue: пропуск итерации
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // пропускаем чётные числа
            }
            System.out.println("Odd i = " + i);
        }
    }
}
