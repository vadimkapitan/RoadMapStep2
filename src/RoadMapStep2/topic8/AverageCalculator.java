package RoadMapStep2.topic8;
/**
 * Создайте Java-программу, которая содержит статический метод getAverage(double[] numbers),
 * возвращающий среднее значение элементов массива. В методе main вызовите этот метод и выведите результат в консоль.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        double[] num = {1.2, 2.4, 3.4, 3};
        double res = getAverage(num);
        System.out.printf("Среднее значение элементов массива: %.2f", res);
    }

    public static double getAverage(double[] numbers) {
        double sum = 0;
        for (double x : numbers) {
            sum += x;
        }
//        sum = sum/ numbers.length;
        return  sum/ numbers.length;
    }
}
 
