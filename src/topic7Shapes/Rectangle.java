package topic7Shapes;

public class Rectangle extends Shape {
    private final double with;
    private final double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    @Override
    public double getArea() {
        return with * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (with + height);
    }
}
