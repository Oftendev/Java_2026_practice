package operator.practice_2;

class Animal { }
class Dog extends Animal { }

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal dogAsAnimal = new Dog();
        // instanceof – проверяет, является ли объект экземпляром класса или его подкласса
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));           // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));   // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));   // false
        System.out.println("dogAsAnimal instanceof Dog: " + (dogAsAnimal instanceof Dog)); // true

        // null-объект
        String nullStr = null;
        System.out.println("null instanceof String: " + (nullStr instanceof String)); // false
        // Ошибки нет – просто false
    }
}