package RoadMapStep2.topic8;

/**
 * Содержит статический метод getGreeting(String name), возвращающий String с приветствием.
 * Метод формирует сообщение вида "Привет, [имя]!".
 * В методе main вызовите этот метод и выведите результат.
 */

public class Greeting {
    public static void main(String[] args) {
        System.out.println(getGreeting("Вадим"));
    }

    static String getGreeting(String name) {
        return "Привет, " + name + "!";
    }
}
