package RoadMapStep2.topic8;

import java.util.Arrays;

/**
 * Создайте Java-программу, которая содержит статический метод findMinMax(int[] numbers),
 * возвращающий массив int длиной 2, где:
 * Первый элемент – минимальное значение массива.
 * Второй элемент – максимальное значение массива.
 * В методе main вызовите этот метод и выведите результаты.
 */

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {234,342,423,1,1,2,3,4,5};
        int[] minMax = findMinMax(array);
        System.out.println(Arrays.toString(minMax));

    }

    static int[] findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            throw new RuntimeException("Массив не должен быть пустым");
        }

        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int arr : numbers) {
            if (arr < minValue) {
                minValue = arr;
            }

            {
                if (arr > maxValue) {
                    maxValue = arr;
                }

            }
        }
        return new int[]{minValue, maxValue};
    }
}
