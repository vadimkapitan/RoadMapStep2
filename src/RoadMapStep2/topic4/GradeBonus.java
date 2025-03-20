package RoadMapStep2.topic4;

public class GradeBonus {
    public static void main(String[] args) {

        int grade = 5;

        //    Вариант №1
        if (grade == 5) {
            System.out.println("Ваша оценка - " + grade + ", ваш бонус - 100%");
        } else if (grade == 4) {
            System.out.println("Ваша оценка - " + grade + ", ваш бонус - 75%");
        } else if (grade == 3) {
            System.out.println("Ваша оценка - " + grade + ", ваш бонус - 50%");
        } else
            System.out.println("Ваша оценка - " + grade + ", ваш бонус = 0%");

        //    Вариант №2
        int bonus;

        if (grade == 5) {
            bonus = 100;
        } else if (grade == 4) {
            bonus = 75;
        } else if (grade == 3) {
            bonus = 50;
        } else
            bonus = 0;
        System.out.println("Ваша оценка " + grade + ", ваш бонус - " + bonus);
    }
}



