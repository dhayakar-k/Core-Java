package modifiers1;

public class Car extends Vehicle {
    private String brand;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    protected void showCarDetails() {
        System.out.println("Car Brand: "+this.brand);
        showMileage();
    }

    public static void main(String[] args) {
        Car car = new Car("TATA Punch EV", 15);
        car.showCarDetails();
    }
}
