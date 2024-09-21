package staticteach.static2;

public class Example1 {

    private  static int counter = 0;
    private final int id;

    public Example1() {
        counter++; // counter = counter + 1;
        id = counter;
    }

    public static void printCounterValue() {
        System.out.println("Counter Value: "+counter);
    }

    public void printId() {
        System.out.println("Id: "+id);
    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        Example1 e2 = new Example1();
        Example1 e3 = new Example1();

        e1.printId();
        e2.printId();
        e3.printId();

        printCounterValue();
    }
}
