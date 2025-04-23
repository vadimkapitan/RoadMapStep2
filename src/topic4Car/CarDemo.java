package topic4Car;

public class CarDemo {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes","GLE COUPE",2024);
        mercedes.displayInfo();
        mercedes.setModel("ML 500");
        mercedes.displayInfo();
    }
}
