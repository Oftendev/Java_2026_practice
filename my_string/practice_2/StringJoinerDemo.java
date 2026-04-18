package my_string.practice_2;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Пример 1: просто с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("one").add("two").add("three");
        System.out.println(sj1);

        // Пример 2: с префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("A").add("B").add("C");
        System.out.println(sj2);
    }
}
