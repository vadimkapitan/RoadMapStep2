package RoadMapStep2.topic8;

/**
 * Содержит статический метод square(int number), возвращающий квадрат числа.
 * В методе main вызовите этот метод с примерным числом и выведите результат.
 */

public class SquareCalculator {
    public static void main(String[] args) {
        System.out.println(square(3));
    }

    static int square(int number) {
        return number * number;
    }

}
