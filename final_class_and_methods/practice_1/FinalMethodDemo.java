package final_class_and_methods.practice_1;

class Parent {
    // final метод - запрещён к переопределению
    public final void cannotOverride() {
        System.out.println("Parent final method");
    }
    public void canOverride() {
        System.out.println("Usual method");
    }
}

class Child extends Parent {
    // @Override
    // public void cannotOverride() { } // Ошибка. Нельзя переопределить final

    @Override
    public void canOverride() {
        System.out.println("Переопределённый метод");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.canOverride();      // всё ок
        c.cannotOverride();   // вызов метода родителя (не переопределён)
    }
}
