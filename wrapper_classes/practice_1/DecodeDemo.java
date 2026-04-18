package wrapper_classes.practice_1;

public class DecodeDemo {
    public static void main(String[] args) {
        Integer dec = Integer.decode("123");   // десятичное -> 123
        Integer hex = Integer.decode("0xFF");  // hex -> 255
        Integer oct = Integer.decode("077");   // восьмеричное -> 63
        System.out.println(dec + " " + hex + " " + oct);
    }
}
