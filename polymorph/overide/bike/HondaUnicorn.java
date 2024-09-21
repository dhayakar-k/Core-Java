package polymorph.overide.bike;

public class HondaUnicorn extends Bike {
    int speedLimit = 120;

    public static void main(String[] args) {
        Bike bike = new HondaUnicorn();
        System.out.println(bike.speedLimit);

        HondaUnicorn hondaUnicorn = new HondaUnicorn();
        System.out.println(hondaUnicorn.speedLimit);
    }
}
