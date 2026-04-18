package overload_and_polymorphism.practice_2;

// переопределённые методы
class Parent {
    Number getValue() { return 10; }
}
class Child extends Parent {
    @Override
    Number getValue() { return 20; } 
    // Integer getValue() { return 20; } // можно, т.к. Integer - подтип Number 
    // double getValue() { return 20; } // Ошибка. double не подтип Number
}

public class App {
    
}
