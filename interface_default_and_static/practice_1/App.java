package interface_default_and_static.practice_1;

interface Greeting {
    // default метод может быть переопределён в классе
    default void sayHello() {
        System.out.println("Hello from interface");
    }

    // static метод вызывается только по имени интерфейса
    static void sayStatic() {
        System.out.println("Static method in interface");
    }
}

class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello from class");
    }
}

public class App {
    public static void main(String[] args) {
        GreetingImpl obj = new GreetingImpl();
        // 1. Вызов переопределённого default метода через объект
        obj.sayHello();
        // 2. Вызов static метода через интерфейс
        // Вызывать default метод самого интерфейса нельзя, только через экземпляр
    }
}
