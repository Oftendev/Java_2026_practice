package operator.practice_1;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (целочисленное)
        System.out.println("a % b = " + (a % b)); // 1

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a <= b: " + (a <= b)); // false

        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false
        System.out.println("x ^ y: " + (x ^ y));   // true 
        
        //побитовые операции
        int c = 5;  // 0101
        int d = 3;  // 0011
        System.out.println("c & d: " + (c & d));   // 1 (0001)
        System.out.println("c | d: " + (c | d));   // 7 (0111)
        System.out.println("c ^ d: " + (c ^ d));   // 6 (0110)
        System.out.println("~c: " + (~c));         // -6 (доп. код)
        System.out.println("c << 1: " + (c << 1)); // 10
        System.out.println("c >> 1: " + (c >> 1)); // 2
        System.out.println("c >>> 1: " + (c >>> 1)); // 2 (беззнаковый сдвиг)

        // Инкремент/декремент
        int counter = 5;
        System.out.println("Постфикс counter++: " + (counter++)); // 5, затем counter=6
        System.out.println("После postfix: " + counter);          // 6
        System.out.println("Префикс ++counter: " + (++counter));  // 7
        System.out.println("Постфикс counter--: " + (counter--)); // 7, затем 6
        System.out.println("Префикс --counter: " + (--counter));  // 5

        // Тернарный оператор ?:
        int max = (a > b) ? a : b;
        System.out.println("max: " + max); // 10

        // Операторы присваивания
        int val = 10;
        val += 5; // val = 15
        val -= 3; // 12
        val *= 2; // 24
        val /= 4; // 6
        val %= 5; // 1
        System.out.println("После присваиваний: " + val);

        // Конкатенация String с + и +=
        String hello = "Hello";
        String world = " world";
        String result = hello + world; // "Hello world"
        result += "!";
        System.out.println(result); // "Hello world!" 
    }

}
