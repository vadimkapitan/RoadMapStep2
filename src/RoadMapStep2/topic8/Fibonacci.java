package RoadMapStep2.topic8;

/**
 * Содержит статический метод fibonacci(int n), возвращающий n-е число Фибоначчи.
 * В методе main вызовите метод с примерным значением n и выведите результат.
 */

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int res = 0;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            res = a+b;
            a = b;
            b=res;
        }
        return res;
    }
}
