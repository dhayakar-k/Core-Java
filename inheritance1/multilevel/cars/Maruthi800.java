package inheritance.multilevel.cars;

public class Maruthi800 extends Maruti {

    public Maruthi800() {
        System.out.println("Maruthi Model: 800");
    }

    public void speed() {
        super.speed();
        System.out.println("Max Speed: 80Kmph");
    }


    public static void main(String[] args) {
        Maruthi800 maruthi800 = new Maruthi800();

        maruthi800.vehicleType();
        maruthi800.brand();
        maruthi800.speed();
    }
}
