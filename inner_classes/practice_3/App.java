package inner_classes.practice_3;

class Outer {
    class Inner {
        @SuppressWarnings("unused")
        private int innerPrivate = 5;
        public int innerPublic = 10;
    }

    void test() {
        Inner i = new Inner();
        // System.out.println(i.innerPrivate); // ошибка, private
        System.out.println(i.innerPublic);  // OK, public
    }
}
// Внешний класс может обращаться к полям внутр. только через объект. Спецификаторы внутр. класса влияет на доступ извне
public class App {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test(); // Выведет только public поле
    }    
}
