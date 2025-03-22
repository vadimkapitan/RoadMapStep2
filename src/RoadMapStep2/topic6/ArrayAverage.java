package RoadMapStep2.topic6;

/**
 * Инициализирует массив целых чисел.
 * Вычисляет сумму всех элементов массива.
 * Делит сумму на количество элементов, получая среднее значение.
 * Выводит результат.
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        int sum = 0;

        for (int arr : array) {
            sum += arr;
        }
       double res = (double) sum / array.length;
        System.out.println(res);
    }
}
