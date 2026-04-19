package my_exception;

class MyCustomException extends Exception {

    // Конструктор без параметров
    public MyCustomException() {
        super();
    }

    // Конструктор с сообщением
    public MyCustomException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (MyCustomException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws MyCustomException {
        if (age < 0) {
            throw new MyCustomException("Возраст не может быть отрицательным: " + age);
        }
    }
}