package staticteach.static1;

public class ClassTest {

    static int a = getIntValue();

    static {
        System.out.println("Static block initialized.");
    }

    static int getIntValue() {
        System.out.println("From getIntValue");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Order of initialization of static block and static variable");
        System.out.println("Value of a : " + a);
        System.out.println("From Main");
    }
}
