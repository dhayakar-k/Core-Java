package inheritance.multilevel;

import inheritance.multilevel.cars.Maruthi800;
import inheritance.multilevel.shape.Cube;

public class Tester {
    public static void main(String[] args) {
        /*WetGrinder wetGrinder = new WetGrinder();

        wetGrinder.category();
        wetGrinder.deviceType();
        wetGrinder.grinderTech();*/

        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();

        /*Maruthi800 maruthi800 = new Maruthi800();

        maruthi800.vehicleType();
        maruthi800.brand();
        maruthi800.speed();*/
    }
}
