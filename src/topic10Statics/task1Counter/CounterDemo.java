package topic10Statics.task1Counter;

public class CounterDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Создано объектов: " + Counter.getCount());
    }
}
