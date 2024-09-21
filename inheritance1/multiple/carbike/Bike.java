package inheritance.multiple.carbike;

public interface Bike {

    default void testBike() {
        System.out.println("Testing Bike");
    }
}
