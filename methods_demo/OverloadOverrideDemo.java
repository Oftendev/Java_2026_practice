package methods_demo;

class Calculator {
    // Перегруженный метод sum для двух целых чисел
    public int sum(int a, int b) {
        return a + b;
    }
    // Перегруженный метод sum для трёх целых чисел
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    // Перегруженный метод sum для двух чисел с плавающей точкой
    public double sum(double a, double b) {
        return a + b;
    }
}

//демонстрация переопределения
class AdvancedCalculator extends Calculator {
    // Переопределяем метод sum(int, int) из родительского класса
    @Override
    public int sum(int a, int b) {
        System.out.println("Overriden sum(int a, int b)");
        return a + b + 10; // добавляем 10 к результату
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Вызовы перегруженных методов:
        System.out.println("sum(2,3) = " + calc.sum(2, 3));           // 5
        System.out.println("sum(2,3,4) = " + calc.sum(2, 3, 4));      // 9
        System.out.println("sum(2.5,3.7) = " + calc.sum(2.5, 3.7));   // 6.2

        AdvancedCalculator advCalc = new AdvancedCalculator();
        // Вызов переопределённого метода:
        System.out.println("advCalc.sum(2,3) = " + advCalc.sum(2, 3)); // 2+3+10 = 15
    }
}
