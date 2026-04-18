package my_enumerations.practice_1;

public class App {
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        System.out.println(s);
        System.out.println(s.getCode());
    }
}

enum Size {
    SMALL(30), MEDIUM(32), LARGE(34);  // размеры и их код
    private int code;
    Size(int code) { this.code = code; } // конструктор (всегда private)
    public int getCode() { return code; }
}