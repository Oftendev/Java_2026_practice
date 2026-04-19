package formatter_and_spec.practice_3;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        // Получаем текущее время
        LocalDateTime now = LocalDateTime.now();

        System.out.printf("Час: %tH, Минуты: %tM, Секунды: %tS%n", now, now, now);
        System.out.printf("Год: %tY, Месяц: %tB%n", now, now);
    }
}
