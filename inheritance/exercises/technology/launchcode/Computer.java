package launchcode;

public class Computer {

    protected String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getInfo() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }

    public void turnOn() {
        System.out.println("Computer is powering on.");
    }
}
