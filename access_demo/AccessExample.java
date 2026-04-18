package access_demo;

public class AccessExample {
    // private: доступно только внутри этого класса
    private int privateField = 1;
    private void privateMethod() { System.out.println("private method"); }

    // default доступно классам в том же пакете
    int defaultField = 2;
    void defaultMethod() { System.out.println("default method"); }

    // protected: доступно в том же пакете + подклассам (даже в других пакетах)
    protected int protectedField = 3;
    protected void protectedMethod() { System.out.println("protected method"); }

    // public: доступно всем классам из любых пакетов
    public int publicField = 4;
    public void publicMethod() { System.out.println("public method"); }

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        // Внутри того же класса доступны все члены (включая private)
        System.out.println(obj.privateField);
        obj.privateMethod();
        System.out.println(obj.defaultField);
        obj.defaultMethod();
        System.out.println(obj.protectedField);
        obj.protectedMethod();
        System.out.println(obj.publicField);
        obj.publicMethod();
        System.out.println("Класс SamePackageClass");
        SamePackageClass obj2 = new SamePackageClass();
        obj2.test();
    }
}

/**
 * Класс в том же пакете (не наследник).
 */
class SamePackageClass {
    void test() {
        AccessExample obj = new AccessExample();
        // private не виден:
        // System.out.println(obj.privateField); // Ошибка компиляции

        // default, protected и public видны в том же пакете:
        System.out.println(obj.defaultField);   // OK
        System.out.println(obj.protectedField); // OK
        System.out.println(obj.publicField);    // OK

        obj.defaultMethod();     // OK
        obj.protectedMethod();   // OK
        obj.publicMethod();      // OK
    }
}
