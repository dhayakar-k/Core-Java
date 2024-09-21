package modifiers;

public class Car extends Vehicle {

    private int mileage;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }
    public void displayCarDetails() {
        displayDetails();
        System.out.println("Mileage: " + mileage);
    }

}
