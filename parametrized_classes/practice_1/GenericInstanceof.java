package parametrized_classes.practice_1;

public class GenericInstanceof {
    public static void main(String[] args) {
        Wrapper<String> ws = new Wrapper<>("Hi");

        // Можно проверить только сырой тип (без параметра)
        if (ws instanceof Wrapper) {
            System.out.println("ws - raw Wrapper");
        }
        // ws instanceof Wrapper<String> – ошибка компиляции
    }
}

class Wrapper<T> {
    @SuppressWarnings("unused")
    private T item;
    Wrapper(T item) { this.item = item; }
}