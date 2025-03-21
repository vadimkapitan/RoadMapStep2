package RoadMapStep2.topic5;

/**
 * Объявляет число n (например, n = 15).
 * С помощью цикла for вычисляет факториал n (произведение чисел от 1 до n).
 * Выводит результат в консоль.
 */

public class FactorialFor {
    public static void main(String[] args) {
        int n = 15;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " = " + factorial);
    }
}
