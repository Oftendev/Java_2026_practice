package using_super_and_this.practice_1;

class Parent {
    int value = 10;
    Parent() { System.out.println("Parent constructor"); }
    void show() { System.out.println("Parent method"); }
}

class Child extends Parent {
    int value = 20;
    Child() {
        super(); // 1. вызов конструктора Parent
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("super.value = " + super.value); // 2. поле Parent
        super.show(); // 3. метод Parent
        System.out.println("this.value = " + this.value);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        new Child().show();
    }
}
