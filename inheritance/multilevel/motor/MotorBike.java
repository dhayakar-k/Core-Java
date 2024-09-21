package inheritance.multilevel.motor;

public class MotorBike extends Bicycle {

    void displayFeatures() {
        super.displayFeatures();
        System.out.println("Added feature by Motorbike : Engine");
    }

    void start() {
        System.out.println("MotorBike is starting..");
    }

    void stop() {
        System.out.println("MotorBike is stopping..");
    }
}
