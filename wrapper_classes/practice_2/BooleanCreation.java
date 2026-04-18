package wrapper_classes.practice_2;

public class BooleanCreation {
    public static void main(String[] args) {
        // Через конструктор (устарел)
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("false");

        // Через valueOf
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf("true");

        // Черех boxing
        Boolean b5 = true;

        // Прямое присваивание
        Boolean b6 = Boolean.TRUE;
        System.out.println(b1 + " " + b3 + " " + b5 + " " + b6);
    }
}