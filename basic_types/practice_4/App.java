package basic_types.practice_4;

public class App {
    public static void main(String[] args) {
        String base = "My string";
        int iVal = 30;
        double dVal = 2.25;
        String result1 = base + iVal;
        System.out.println(result1);
        
        String result2 = "Sum " + (2 + 2); //сначала скобки, потом конкатенация
        System.out.println(result2); 

        String result3 = "Целое число " + iVal + ", вещ. число " + dVal;
        System.out.println(result3);
    }
}