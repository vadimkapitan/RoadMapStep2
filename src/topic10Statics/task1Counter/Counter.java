package topic10Statics.task1Counter;

public class Counter {
    private static int counter;

    public Counter() {
        counter++;
    }

    public static int getCount() {
        return counter;
    }
}