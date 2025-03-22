package RoadMapStep2.topic7;

/**
 * Инициализирует массив целых чисел.
 * Использует цикл for-each для вычисления суммы всех элементов.
 * Выводит полученную сумму в консоль.
 */

public class ForEachSum {
    public static void main(String[] args) {
        int[] array = {13, 2, 4, 1, 3};
        int sum = 0;

        for (int arr : array) {
            sum += arr;
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}
