package wrapper_classes.practice_4;

public class App {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1; // автоупаковка
        Integer b1 = i1; // автоупаковка
        System.out.println("a1==i1 " + (a1 == i1)); // true (unboxing a1 до int)
        System.out.println("b1==i1 " + (b1 == i1)); // true
        System.out.println("a1==b1 " + (a1 == b1)); // false (разные объекты)
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2)); // true
        System.out.println("b2==i2 " + (b2 == i2)); // true
        System.out.println("a2==b2 " + (a2 == b2)); // true (оба из кэша)
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true

        // Пояснение: разность результатов a1 == b1 и a1.equals(b1) связана с внутренним кэшем IntegerCache внутри класса Integer. При написании Integer a1 = 128; компилятор проверяет, лежит ли число в диапазоне кэширования (-128...127). Если лежит, то возвращает ссылку на заранее созданный объект кэша, если нет - создаёт НОВЫЙ объект. Отсюда и разница для i1 = 127 и i2 = 128
    }
}
