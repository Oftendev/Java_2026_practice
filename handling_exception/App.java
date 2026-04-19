package handling_exception;

public class App {
    public static void main(String[] args) {
        // Перехваченное исключение (ArithmeticException)
        try {
            int result = 10 / 0; // деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

        // Неперехваченное исключение (NullPointerException). Здесь программа аварийно завершится, так как нет обработчика.
        String str = null;
        str.length(); // здесь JVM остановит выполнение
    }
}
