package inner_classes.practice_2;

class Outer {
    private int privateField = 10;
    public int publicField = 20;

    class Inner {
        void show() {
            System.out.println(privateField); // OK, private доступен
            System.out.println(publicField);  // OK
        }
    }
}
// т.о. внутренний класс имеет доступ к ЛЮБЫМ полям/методам внешнего. Спецификаторы внешнего класса не виляют на доступ внутри
public class App {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show(); // Выведет оба поля (включая private)
    }    
}
