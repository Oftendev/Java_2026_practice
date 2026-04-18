package my_string.practice_3;

public class TextBlock {
    public static void main(String[] args) {
        //Текстовый блок - синтаксис, позволяющий удобно писать многострочные строчки без экранирования и переносов
        // Старый способ (с экранированием и конкатенацией)
        String oldWay = "row 1\n" + "row 2\n" + "row 3";

        // Новый способ (текстовый блок)
        String textBlock = """
                Строка 1
                Строка 2
                Строка 3""";

        System.out.println(textBlock.equals(oldWay)); // true
    }
}