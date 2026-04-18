package object_class;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Сравниваем с самим собой
        if (this == obj) return true;
        // Проверка на null и что сравнимые объекты - экземпляры одного класса
        if (obj == null || getClass() != obj.getClass()) return false;
        // Приведение типа к Person для получения доступа к полям
        Person other = (Person) obj;
        // Сравниваем поля
        return age == other.age && name.equals(other.name);
    }
}

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Анна", 25);
        Person p2 = new Person("Анна", 25);
        Person p3 = new Person("Иван", 30);
        
        System.out.println(p1.equals(p2)); // true (одинаковые)
        System.out.println(p1.equals(p3)); // false (разные)
        System.out.println(p1.equals(p1)); // true (тот же объект)
    }    
}
