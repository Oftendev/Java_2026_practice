package static_methods;

public class StaticDemo {
    public static void main(String[] args) {
        // Вызов через имя класса
        A.printVars();

        // Вызов через объект класса (работает, но не рекомендуется, создаёт иллюзию принадлежности объекту)
        A obj = new A();
        obj.printVars();

        //Внутри класса A можно было бы использовать метод так:
        // printVars();
        // Но здесь мы находимся вне класса A, поэтому этот вариант недоступен
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}