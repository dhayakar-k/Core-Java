package inheritance.multilevel.motor;

public class ElectricBike extends  MotorBike {

    void displayFeatures() {
        super.displayFeatures();
        System.out.println("Added feature by ElectricBike : Electric Motor and Battery");
    }
}
