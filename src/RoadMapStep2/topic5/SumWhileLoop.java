package RoadMapStep2.topic5;

/**
 * Объявляет переменную N (например, N = 100).
 * Использует цикл while для вычисления суммы чисел от 1 до N.
 * Выводит результат.
 */

public class SumWhileLoop {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
            System.out.println(sum + ":" + i);
        }
    }
}


//        int n = 100;
//        int sum = 0;
//        int i = 0;
//
//        while (i < n) {
//            i++;
//            sum += i;
//            System.out.println(sum + ":" + i);
//        }
