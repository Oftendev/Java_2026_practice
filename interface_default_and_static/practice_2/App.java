package interface_default_and_static.practice_2;

interface A {
    default void common() {
        System.out.println("A.default");
    }
}

interface B {
    default void common() {
        System.out.println("B.default");
    }
}

// Класс C реализует сразу 2 интерфейса, в которых есть конфликтующие default методы (называется diamond problem). Решение переопределить метод и опционально выбрать нужный интерфейс через super
class C implements A, B {
    // Переопределяем общий метод
    @Override
    public void common() {
        // Можно выбрать реализацию одного из интерфейсов используя синтаксис interface.super.method()
        A.super.common();
        // или B.super.common();
        System.out.println("C own implementation");
    }
}

public class App {
    public static void main(String[] args) {
        new C().common();
    }
}