package inheritance.multilevel.motor;

public class ElectricBike extends MotorBike {

    public void displayFeatures() {
        super.displayFeatures();
        System.out.println("New feature by ElectricBike: Electric Motor and battery ");
    }
}
