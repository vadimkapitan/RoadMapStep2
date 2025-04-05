package RoadMapStep2.topic8;


/**
 * Содержит статический метод isPalindrome(String text), возвращающий boolean.
 * Метод проверяет, является ли переданная строка палиндромом (без учета пробелов и регистра).
 * В методе main протестируйте метод с примерной строкой.
 */

public class PalindromeChecker {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam I'm adam"));
        System.out.println(isPalindromeTwo("Madam I'm adam"));
        System.out.println(isPalindromeThree("Madam I'm adam"));

    }

    static boolean isPalindrome(String text) {
        String replaceText = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        String textReverse = new StringBuilder(replaceText).reverse().toString();

        return replaceText.equals(textReverse);
    }

    static boolean isPalindromeTwo(String text) {

        String clean = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromeThree(String text) {
        char[] charArray = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase().toCharArray();

        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
