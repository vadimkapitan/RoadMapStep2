package RoadMapStep2.topic5;

/**
 * Объявляет число n (например, n = 5).
 * С помощью цикла while вычисляет факториал этого числа.
 * Выводит результат в консоль.
 */

public class FactorialWhile {
    public static void main(String[] args) {
        int factorial = 5;
        int factorialResult = 1;
        int i = 0;

        while (i < factorial) {
            i++;
            factorialResult *= i;
//            System.out.println(factorialResult);
        }
        System.out.println("Факториал числа: " + factorial + " = " + factorialResult);
    }
}
