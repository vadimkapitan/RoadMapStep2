package RoadMapStep2.topic4;

/**
 * Принимает номер месяца (целое число от 1 до 12).
 * С помощью switch-case определяет сезон:
 * Если месяц 12, 1 или 2 → "Зима".
 * Если месяц 3, 4 или 5 → "Весна".
 * Если месяц 6, 7 или 8 → "Лето".
 * Если месяц 9, 10 или 11 → "Осень".
 * Выводит название сезона в консоль.
 */

public class SeasonFinder {


    public static void main(String[] args) {
        int numberMonth = 1;

        switch (numberMonth) {
            case 12, 1, 2 -> System.out.println(numberMonth + " Месяц - Зима");
            case 3, 4, 5 -> System.out.println(numberMonth + " Месяц - Весна");
            case 6, 7, 8 -> System.out.println(numberMonth + " Месяц - Лето");
            case 9, 10, 11 -> System.out.println(numberMonth + " Месяц - Осень");
            default -> System.out.println("Такого месяца нет");
        }
    }
}
