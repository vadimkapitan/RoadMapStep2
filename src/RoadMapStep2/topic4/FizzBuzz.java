package RoadMapStep2.topic4;

/**
 * Принимает число (целое значение).
 * С помощью последовательных условий if/else проверяет:
 * Если число делится на 3 и 5 без остатка, вывести "FizzBuzz".
 * Если число делится только на 3, вывести "Fizz".
 * Если число делится только на 5, вывести "Buzz".
 * Иначе, вывести само число.
 * Выведите результат в консоль.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        int value = 15;

        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(value);
    }
}
