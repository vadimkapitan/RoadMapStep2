package RoadMapStep2.topic4;

/**
 * Принимает значение возраста (целое число).
 * С помощью конструкции if/else if/else определяет категорию:
 * Менее 13 → "Ребенок"
 * От 13 до 19 → "Подросток"
 * От 20 до 64 → "Взрослый"
 * 65 и старше → "Пожилой"
 * Выводит результат в консоль.
 */
public class AgeCategory {
    public static void main(String[] args) {
        int age = 65;
        String grade = "";

        if (age < 13) {
            grade = "Ребенок";
        } else if (age <= 19) {
            grade = "Подросток";
        } else if (age <= 64) {
            grade = "Взрослый";
        } else
            grade = "Пожилой";
        System.out.println("Возраст - " + age + "\nКатегория - " + grade);
    }
}
