public class Vehicle123 {
    private String brand;
    private String type;

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String brand, String type, String model) {
        super(brand, type); 
        this.model = model;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Starting the car.");
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: " + model);
    }
}
