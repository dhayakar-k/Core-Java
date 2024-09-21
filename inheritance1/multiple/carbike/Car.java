package inheritance.multiple.carbike;

public interface Car {

    default void testCar() {
        System.out.println("Testing Car");
    }
}
