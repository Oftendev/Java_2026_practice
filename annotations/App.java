package annotations;

import java.util.ArrayList;
import java.util.List;

class Parent {
    void oldMethod() { }
}

class Child extends Parent {
    // @Override – проверяет, что метод действительно переопределяет метод суперкласса
    // Помогает обнаружить опечатки (например, oldmethod вместо oldMethod)
    @Override
    void oldMethod() { }
}

public class App {
    // @Deprecated – помечает элемент как устаревший
    // Компилятор выдаст предупреждение при использовании
    @Deprecated
    static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    @SuppressWarnings("unchecked") // подавляет предупреждения компилятора (например, unchecked cast)
    static void suppressExample() {
    List raw = new ArrayList();
    List<String> strings = (List<String>) raw; // warning здесь
}
}