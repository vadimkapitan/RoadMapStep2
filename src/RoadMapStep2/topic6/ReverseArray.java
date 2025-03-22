package RoadMapStep2.topic6;

/**
 * Инициализирует массив целых чисел.
 * С помощью цикла выводит элементы массива в обратном порядке.
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {13, 2, 3, 4, 5, 9};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
