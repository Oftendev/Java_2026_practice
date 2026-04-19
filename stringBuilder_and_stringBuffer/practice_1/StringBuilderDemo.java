package stringBuilder_and_stringBuffer.practice_1;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // 1. append() - добавляет строку в конец
        sb.append(" Programming");
        System.out.println("append: " + sb);

        // 2. insert(int offset, String str) - вставка в позицию
        sb.insert(0, "Learn ");
        System.out.println("insert: " + sb);

        // 3. replace(int start, int end, String str) - замена подстроки
        sb.replace(6, 10, "C++");
        System.out.println("replace: " + sb);

        // 4. delete(int start, int end) - удаление символов
        sb.delete(6, 9); // удаляем "C++"
        System.out.println("delete: " + sb); // Learn  Programming

        // 5. reverse() - переворот строки
        sb.reverse();
        System.out.println("5. reverse: " + sb);

        // 6. length() - длина строки
        System.out.println("length: " + sb.length());

        // 7. charAt(int index) - символ по индексу
        System.out.println("charAt(2): " + sb.charAt(2)); // i

        // 8. substring(int start) - возвращает подстроку (как String)
        String sub = sb.substring(5);
        System.out.println("substring: " + sub); // argorP nraeL

        // 9. indexOf(String str) - индекс подстроки
        System.out.println("indexOf('rae'): " + sb.indexOf("rae"));

        // 10. setCharAt(int index, char ch) - замена символа
        sb.setCharAt(0, 'L');
        System.out.println("setCharAt: " + sb);
    }
}