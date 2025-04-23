package topic9String.task2StringComparison;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Goida!";
        String str2 = new String("Goida!");

        System.out.println("Сравнение через == " + (str1 == str2));
        System.out.println("Сравнение через equals " + (str1.equals(str2)));
    }
}
