package RoadMapStep2.topic3;

public class StringComparison {
    public static void main(String[] args) {
        String firstStr = "Life is Good";
        String secondStr = new String("Life is Good");

        System.out.println("Сравнение через '==' : " + (firstStr == secondStr));
        System.out.println("Сравнение через 'equals()' : " + firstStr.equals(secondStr));
    }
}
