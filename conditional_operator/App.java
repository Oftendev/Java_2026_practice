package conditional_operator;

public class App {
    public static void main(String[] args) {
        int i = 0;
        int a = 10;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println(i);
    }
}
