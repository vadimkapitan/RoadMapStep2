package RoadMapStep2.topic7;

/**
 * Инициализирует массив целых чисел (с отрицательными и положительными значениями).
 * Использует цикл for-each для проверки каждого элемента.
 * Выводит в консоль только те числа, которые больше 0.
 */
public class ForEachPositive {
    public static void main(String[] args) {
        int[] array = {13,-23, 8, 7, -3, 2, -100};
        for (int arr : array) {
            if (arr > 0) {
                System.out.print(arr + " ");
            }
        }
    }
}
