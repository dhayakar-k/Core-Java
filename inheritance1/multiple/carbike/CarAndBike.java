package inheritance.multiple.carbike;

public class CarAndBike implements Car, Bike {

    @Override
    public void testBike() {
        Bike.super.testBike();
        System.out.println("Bike Test");
    }

    @Override
    public void testCar() {
        Car.super.testCar();
        System.out.println("Car Test");
    }

    public static void main(String[] args) {
        CarAndBike cab = new CarAndBike();
        cab.testBike();
        cab.testCar();
    }
}
