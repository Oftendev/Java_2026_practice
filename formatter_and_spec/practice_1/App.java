package formatter_and_spec.practice_1;

public class App {
    public static void main(String[] args) {
        // %s – строковое представление
        // %d – десятичное целое
        // %f – число с плавающей точкой
        // %b – логическое значение
        // %n – перевод строки (не зависит от платформы)
        String name = "Java";
        int version = 17;
        double pi = 3.14159;
        boolean isFun = true;

        System.out.printf("Язык: %s%n", name);
        System.out.printf("Версия: %d%n", version);
        System.out.printf("Число Пи: %.2f%n", pi);
        System.out.printf("Интересно? %b%n", isFun);
        System.out.printf("Это перевод строки%nИ ещё одна строка%n");
    }
}
