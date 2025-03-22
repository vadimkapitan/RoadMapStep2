package RoadMapStep2.topic6;

/**
 * Инициализирует массив целых чисел.
 * Подсчитывает, сколько раз заданное число (например, 5) встречается в массиве.
 * Выводит результат.
 */

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,6,5,6,7,3,2,4,5,6,5};
        int value = 5;
        int counter = 0;

        for (int a : array) {
            if (a == value) {
                counter +=1;
            }
        }
                System.out.println("Число " + value + " встречается " + counter + " раз(a).");
    }
}
