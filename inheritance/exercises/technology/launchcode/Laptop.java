package launchcode;

public class Laptop extends Computer{
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super (brand, model, price);
        this.screenSize = screenSize;
    }

    public void openLid() {
        System.out.println("Laptop lid is opened.");
    }
}
