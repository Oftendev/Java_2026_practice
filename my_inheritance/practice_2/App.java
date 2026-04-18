package my_inheritance.practice_2;

// private - НЕ наследуется (не виден в подклассах)
// default (package-private) - наследуется, если подкласс в том же пакете
// protected: наследуется всегда (виден в подклассах даже в других пакетах)
// public: наследуется всегда
class A {
    int a1;
    public int a2;
    protected int a3;
    @SuppressWarnings("unused")
    private int a4;

    void method1() {
    }

    public void method2() {
    }

    protected void method3() {
    }

    @SuppressWarnings("unused")
    private void method4() {
    }
}

class B extends A {
    // Наследуются a1 (если в том же пакете), a2, a3, method1, method2, method3
    // Не наследуются a4, method4
    void test() {
        // a4 = 5; // Ошибка private не виден
        a1 = 1; // OK
        a2 = 2; // OK
        a3 = 3; // OK
        method2(); // OK
        method3(); // OK
    }
}

class C extends B {
    // Доступность такая же, как в B. protected и public проходят через всю цепочку
}

public class App {
    public static void main(String[] args) {

    }
}
