package RoadMapStep2.topic4;

/**
 * Принимает число (целое значение).
 * С помощью тернарного оператора присваивает строковую переменную значению:
 * "Положительное", если число больше 0.
 * "Нулевое или отрицательное", если число меньше или равно 0.
 * Выводит результат.
 */

public class PositiveCheckTernary {
    public static void main(String[] args) {
        int value = 1;
        String result = value > 0 ? "Положительное" : "Нулевое или отрицательное";
        System.out.println(result);
    }
}
