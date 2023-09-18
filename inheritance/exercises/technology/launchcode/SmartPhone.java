package launchcode;

public class SmartPhone extends Computer {
    private String operatingSystem;

    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from " + brand + "smartphone.");
    }
}
