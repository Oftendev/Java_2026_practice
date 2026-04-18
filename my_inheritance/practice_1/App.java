package my_inheritance.practice_1;

// super - ссылка на суперкласс (родитель) this - на текущий объект
// super может использоваться для вызова конструктора родителя, доступа к его скрытам полям
class Parent {
    int value = 10;

    Parent() {
        System.out.println("Constructor Parent");
    }

    void show() {
        System.out.println("Parent.show()");
    }
}

class Child extends Parent {
    int value = 20; // скрывает поле value из Parent

    Child() {
        super(); // вызов конструктора Parent (должен быть первым)
        System.out.println("Constructor Child");
    }

    void show() {
        super.show(); // вызов метода Parent
        System.out.println("Child.show()");
        System.out.println("super.value = " + super.value); // 10
        System.out.println("this.value = " + this.value); // 20
    }
}

public class App {
    public static void main(String[] args) {
        new Child().show();
    }
}