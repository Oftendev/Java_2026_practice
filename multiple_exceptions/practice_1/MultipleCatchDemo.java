package multiple_exceptions.practice_1;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        // несколько исключений обрабатываются абсолютно идентичным образом
        try {
            // Генерируем одно из исключений
            // throw new ArithmeticException();
            throw new NullPointerException();
        } catch (NullPointerException | ArithmeticException e) {
            // оба исключения обрабатываются одинаково
            System.out.println("Обработано: " + e.getClass().getSimpleName());
        }

        // иерархия Ex1 <-- Ex2 <-- Ex3 (Exception -> RuntimeException -> ArithmeticException)
        // при нескольких catch Java идёт по ним последовательно, пока какой-то catch не сработает. После этого
        // Java выходит из блока. Поэтому важен порядок исключений - от менее общего к более общему
        try {
            throw new ArithmeticException("Деление на ноль");
        } catch (RuntimeException e) { // родительский класс
            System.out.println("RuntimeException: " + e.getMessage());
            //Здесь Java выйдет для нашего случая
        } catch (Exception e) { // более общий- никогда не выполнится, но компилятор требует
            System.out.println("Exception: " + e.getMessage());
        }


    }
}
