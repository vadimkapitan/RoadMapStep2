package RoadMapStep2.topic8;

import java.util.Arrays;

/**
 * Содержит статический метод getEvenNumbers(int n), возвращающий массив int из первых n чётных чисел.
 * В методе main вызовите этот метод и выведите массив (например, с помощью Arrays.toString()).
 */

public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] evenNumbers = getEvenNumbers(10);
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int[] getEvenNumbers(int n) {
        int[] array = new int[n];
        int lastDigit = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = lastDigit + 2;
            lastDigit = array[i];
        }
        return array;
    }
}