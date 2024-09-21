package inheritance.multilevel.motor;

public class MotorBike extends Bicycle {

    public void displayFeatures() {
        super.displayFeatures();
        System.out.println("Added Feature by MotorBike: Engine");
    }
}
