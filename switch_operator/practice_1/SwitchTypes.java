package switch_operator.practice_1;

public class SwitchTypes {
    public static void main(String[] args) {
        // 1. byte
        byte b = 2;
        switch (b) {
            case 1: System.out.println("byte 1"); break;
            case 2: System.out.println("byte 2"); break;
            default: System.out.println("byte default");
        }

        // 2. short
        short s = 3;
        switch (s) {
            case 3: System.out.println("short 3"); break;
            default: System.out.println("short default");
        }

        // 3. char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("char A"); break;
            case 'B': System.out.println("char B"); break;
        }

        // 4. int
        int i = 10;
        switch (i) {
            case 10: System.out.println("int 10"); break;
            default: System.out.println("int default");
        }

        // 5. enum
        enum Color { RED, GREEN }
        Color col = Color.RED;
        switch (col) {
            case RED: System.out.println("красный"); break;
            case GREEN: System.out.println("зеленый"); break;
        }

        // 6. String
        String str = "hello";
        switch (str) {
            case "hello": System.out.println("привет"); break;
            case "bye": System.out.println("пока"); break;
        }
    }
}