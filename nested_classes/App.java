package nested_classes;

interface Greeting {
    String DEFAULT_PREFIX = "Hello, ";

    // Вложенный класс
    public static class Hello {
        public void say(String name) {
            System.out.println(DEFAULT_PREFIX + name);
        }
    }
}

public class App {
    public static void main(String[] args) {
        // Вызов метода вложенного класса
        Greeting.Hello hello = new Greeting.Hello();
        hello.say("world"); // Вывод: Hello, world
    }
}