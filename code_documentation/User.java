package code_documentation;

/**
 * Класс {@code User} представляет пользователя системы.
 * <p>
 * Этот класс хранит основную информацию о пользователе, такую как имя и возраст,
 * и предоставляет методы для получения этих данных.
 * </p>
 *
 * @author Мухамадиев К.Ш.
 * @version 1.0
 */
public class User {
    private String name;
    private int age;
    /**
     * Создает нового пользователя с заданным именем и возрастом.
     *
     * @param name Имя пользователя. Не может быть {@code null}.
     * @param age  Возраст пользователя. Должен быть положительным числом.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * Возвращает имя пользователя.
     *
     * @return Имя пользователя в виде строки.
     */
    public String getName() {
        return name;
    }
    /**
     * Возвращает возраст пользователя.
     *
     * @return Возраст пользователя.
     */
    public int getAge() {
        return age;
    }
}
/*
Для генерации документации используем команду
javadoc -d docs -sourcepath src -subpackages user
Где:
-d docs: создает папку docs и сохраняет всю сгенерированную документацию в нее
-sourcepath src: указывает, где лежат исходные .java файлы
-subpackages user: обрабатывает пакет user и все его подпакеты.
*/