package byte_streams.practice_4;
// AutoCloseable позволяет использовать try-with-resources для автоматического закрытия ресурсов.
// Все потоки ввода-вывода реализуют этот интерфейс.

class MyResource implements AutoCloseable {
    public void doWork() { System.out.println("Работаю"); }
    @Override
    public void close() { System.out.println("Ресурс закрыт"); }
}

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.doWork();
        } // close() вызывается автоматически
    }
}