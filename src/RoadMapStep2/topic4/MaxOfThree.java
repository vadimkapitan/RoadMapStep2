package RoadMapStep2.topic4;

import javax.crypto.spec.PSource;

/**
 * Принимает три числа (целые значения).
 * С помощью конструкции if/else определяет, какое число является наибольшим.
 * Выводит результат в консоль.
 */

public class MaxOfThree {
    public static void main(String[] args) {


        int one = 1;
        int two = 2;
        int three = 3;

        // Вариант 1
        int result;

        if (one > two) {
            result = one;
        } else if (two > three) {
            result = two;
        } else
            result = three;

        System.out.println("Наибольшее число: " + result);


        //Вариант 2
        if (one > two) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число: " + two);
        } else
            System.out.println("Наибольшее число: " + three);
    }
}