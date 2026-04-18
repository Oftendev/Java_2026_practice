package overload_and_polymorphism.practice_3;

class Parent {
    void sayHello() { System.out.println("Hello"); }
}
class Child extends Parent {
    @Override
    //тут я пишу переопределяющий метод и случайно ошибаюсь в имени 
    void sayHello() { }
    //void sayHelo() { } Ошибка компиляции: нет такого метода в Parent
}
public class App {
    
}
