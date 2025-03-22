package RoadMapStep2.topic7;

/**
 * Инициализирует массив строк.
 * Использует цикл for-each для вывода каждого элемента на новой строке.
 */
public class ForEachStringPrint {
    public static void main(String[] args) {
        String[] array = {"My", "work", "is", "very", "hard", "!"};
        for (String arr : array) {
            System.out.println(arr);
        }
    }
}
