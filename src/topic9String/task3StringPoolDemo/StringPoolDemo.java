package topic9String.task3StringPoolDemo;

public class StringPoolDemo {
    public static void main(String[] args) {
        String str1 = "In God We Trust";
        String str2 = "In God We Trust";

        System.out.println("Сравнение через ==, так работает String Pool : " + (str1 == str2));
    }
}
