package stringBuilder_and_stringBuffer.practice_2;

public class ConversionDemo {
    public static void main(String[] args) {
        // String -> StringBuilder
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str); // конструктор
        StringBuffer sbf = new StringBuffer(str);  // конструктор

        // StringBuilder -> String
        String fromSB = sb.toString();

        // StringBuffer -> String
        String fromSBF = sbf.toString();

        // StringBuilder <-> StringBuffer через String
        StringBuffer sbToSbf = new StringBuffer(sb.toString());
        StringBuilder sbfToSb = new StringBuilder(sbf.toString());

        System.out.println("String: " + str);
        System.out.println("StringBuilder -> String: " + fromSB);
        System.out.println("StringBuffer -> String: " + fromSBF);
        System.out.println("StringBuilder -> StringBuffer: " + sbToSbf);
        System.out.println("StringBuffer -> StringBuilder: " + sbfToSb);
    }
}