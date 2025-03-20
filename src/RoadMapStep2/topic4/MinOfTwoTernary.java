package RoadMapStep2.topic4;

/**
 * Принимает два числа (целые значения).
 * С помощью тернарного оператора определяет минимальное из двух.
 * Выводит минимальное значение в консоль.
 */

public class MinOfTwoTernary {
    public static void main(String[] args) {

        int oneValue = 3;
        int twoValue = 4;

        int result = (oneValue < twoValue) ? oneValue : twoValue;
        System.out.println("Минимальное значение: " + result);
    }
}