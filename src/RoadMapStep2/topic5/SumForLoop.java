package RoadMapStep2.topic5;

/**
 * Инициализирует переменную для суммы.
 * Использует цикл for для перебора чисел от 1 до 1000.
 * Выводит итоговую сумму в консоль.
 */

public class SumForLoop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum +=i;
        }
            System.out.println("Итоговая сумма: " + sum + "$");
    }
}
