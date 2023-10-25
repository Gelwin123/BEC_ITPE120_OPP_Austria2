public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); 
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
