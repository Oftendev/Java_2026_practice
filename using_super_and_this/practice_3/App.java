package using_super_and_this.practice_3;

// this() вызов другого конструктора того же класса. Он должен быть первым оператором в конструкторе
class A {
    int a, b, c, z;

    // Базовый конструктор инициализирует z
    public A() {
        this(0, 0, 0); // вызываем конструктор с тремя параметрами
    }

    public A(int a) {
        this(a, 0, 0);
    }

    public A(int a, int b) {
        this(a, b, 0);
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // единая инициализация z
    }
}

public class App {

}
