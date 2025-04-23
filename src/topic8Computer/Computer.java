package topic8Computer;

public class Computer {
    private String brand;
    private String model;
    private int ram;


    public void displaySpecs() {
        System.out.println("Brand: " + brand + '\n' + "Model: " + model + '\n' + "Ram: " + ram);
    }

    public Computer(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
