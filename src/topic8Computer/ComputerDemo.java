package topic8Computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("MSi", "gl73", 512);
        computer.displaySpecs();
        computer.setBrand("Acer");
        computer.displaySpecs();
    }
}
