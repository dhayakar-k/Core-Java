package polymorph.overide.vehicle;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car Type: " + car.type);

        Car punchEV = new Car();
        System.out.println("PunchEV Type: " + punchEV.type);
    }
}
