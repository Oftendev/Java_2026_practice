package basic_types.practice_1;

public class App {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;
    public static void main(String[] args) {
        byte b = 55;
        short s = 15600;
        int i = 1_000_000;
        long l = 9_000_000_000L;
        float f = 3.14f;
        double d = 3.1415926535;
        char c = 'A';
        boolean bool = true;
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("byte: " + defaultByte); 
        System.out.println("short: " + defaultShort); 
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong); 
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + defaultChar);
        System.out.println("boolean: " + defaultBoolean);
    }
}
