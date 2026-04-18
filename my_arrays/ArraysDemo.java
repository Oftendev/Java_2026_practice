package my_arrays;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // 1. toString() — преобразование массива в строку
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("numbers array: " + Arrays.toString(numbers));

        // 2. sort() — сортировка массива
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 3. binarySearch() — поиск элемента (только в отсортированном массиве)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("index 8: " + index); // 3

        // 4. equals() — сравнение массивов на равенство
        int[] otherArr = {1, 2, 5, 8, 9};
        boolean isEqual = Arrays.equals(numbers, otherArr);
        System.out.println("Arrays equality: " + isEqual); // true

        // 5. compare() — лексикографическое сравнение
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        System.out.println("compare(arr1, arr2): " + Arrays.compare(arr1, arr2)); // -1
        System.out.println("compare(arr2, arr1): " + Arrays.compare(arr2, arr1)); // 1
    }
}