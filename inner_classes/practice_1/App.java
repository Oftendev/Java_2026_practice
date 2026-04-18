package inner_classes.practice_1;

class Outer {
    private class PrivateInner { } // доступен только внутри Outer
    class DefaultInner { } // доступен в пакете
    protected class ProtectedInner { } // доступен в пакете + подклассам
    public class PublicInner { } // доступен везде

    void test() {
        @SuppressWarnings("unused")
        PrivateInner p = new PrivateInner(); // OK внутри класса
    }
}

class OtherInSamePackage {
    void test() {
        Outer o = new Outer();
        // Outer.PrivateInner p = o.new PrivateInner(); // ошибка
        @SuppressWarnings("unused")
        Outer.DefaultInner d = o.new DefaultInner(); // OK
        @SuppressWarnings("unused")
        Outer.ProtectedInner pr = o.new ProtectedInner(); // OK
        @SuppressWarnings("unused")
        Outer.PublicInner pu = o.new PublicInner(); // OK
    }
}

public class App {
    public static void main(String[] args) {
        Outer o = new Outer();
        // Outer.PrivateInner p = o.new PrivateInner(); // Ошибка - private
        @SuppressWarnings("unused")
        Outer.DefaultInner d = o.new DefaultInner();   // OK
        @SuppressWarnings("unused")
        Outer.ProtectedInner pr = o.new ProtectedInner(); // OK
        @SuppressWarnings("unused")
        Outer.PublicInner pu = o.new PublicInner();    // OK
        System.out.println("Доступные классы созданы");
    }    
}
