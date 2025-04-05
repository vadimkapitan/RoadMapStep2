package RoadMapStep2.topic8;

/**
 * Содержит статический метод isPrime(int number), возвращающий boolean.
 * Метод проверяет, является ли число простым.
 * В методе main протестируйте метод на примере числа.
 */

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
