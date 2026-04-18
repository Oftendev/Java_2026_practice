package using_super_and_this.practice_2;

class A {
    int a = 1;

    void method() {
        System.out.println("A.method()");
    }
}

class B extends A {
} // нет ни a, ни method

class C extends B {
    void method() {
        int a = super.a; // берёт поле из A (значение 1) (super в классе C обращается к непосредственному
                         // родителю - классу B. Но там нет поля и Java автоматически поднимается выше по
                         // иерархии к A)
        super.method(); // вызывает метод из A
        System.out.println("a из A = " + a);
    }
}

public class SuperInheritance {
    public static void main(String[] args) {
        new C().method(); // выведет A.method() и a из A = 1
    }
}
