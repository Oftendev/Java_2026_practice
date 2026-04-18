package my_enumerations.practice_2;

enum Priority {
    LOW, HIGH;
    // доп метод
    public String getMessage() {
        return this == LOW ? "Low priority" : "High priority";
    }
}

public class SimpleEnumDemo {
    public static void main(String[] args) {
        // Дополнительный метод
        System.out.println(Priority.HIGH.getMessage());
    }
}
