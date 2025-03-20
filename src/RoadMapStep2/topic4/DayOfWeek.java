package RoadMapStep2.topic4;

/**
 * Принимает номер дня недели (целое число от 1 до 7).
 * Использует конструкцию switch-case для определения:
 * Названия дня (например, 1 – "Понедельник", 2 – "Вторник" и т.д.).
 * Типа дня: если номер от 1 до 5, то "Рабочий день", если 6 или 7, то "Выходной".
 * Выводит полученную информацию.
 */

public class DayOfWeek {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Введен не корректный день");
        }

        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Рабочий день");
        } else if (dayOfWeek > 5 && dayOfWeek <= 7) {
            System.out.println("Выходной день");
        } else
            System.out.println("");
    }
}
