package my_string.practice_1;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Java Programming  ";

        // 1. length()  -  возвращает длину строки
        System.out.println("length: " + str.length());

        // 2. trim() - удаляет пробелы в начале и конце
        String trimmed = str.trim();
        System.out.println("trim: '" + trimmed + "'");

        // 3. toLowerCase() / toUpperCase() - регистр
        System.out.println("lower: " + trimmed.toLowerCase());
        System.out.println("upper: " + trimmed.toUpperCase());

        // 4. charAt(int index) - символ по индексу
        System.out.println("charAt(5): " + trimmed.charAt(5));

        // 5. substring(int begin, int end) - вырезает подстроку
        System.out.println("substring(5,11): " + trimmed.substring(5, 11));

        // 6. indexOf(String sub) - индекс первого вхождения
        System.out.println("indexOf('gram'): " + trimmed.indexOf("gram"));

        // 7. replace(CharSequence old, CharSequence new) - замена
        System.out.println("replace('a', 'o'): " + trimmed.replace('a', 'o'));

        // 8. startsWith(String prefix) / endsWith(String suffix)
        System.out.println("startsWith('Java'): " + trimmed.startsWith("Java"));
        System.out.println("endsWith('ing'): " + trimmed.endsWith("ing"));

        // 9. split(String regex) - разбиение на массив
        String[] words = trimmed.split(" ");
        System.out.print("split: ");
        for (String w : words) System.out.print(w + "|");

        // 10. equals(Object obj) - сравнение содержимого
        String another = "Java Programming";
        System.out.println("\nequals(another): " + trimmed.equals(another));
    }
}
