package staticteach.static1;

public class ClassTest1 {

    static int a = 10;
    int b = 20;
    static void initVars() {
        System.out.println("Inside initVars");
        a = 30;
        //b = 40; // Cannot make a static reference to the non-static field b
        normalMethod();
    }

    static void normalMethod() {
        System.out.println("Inside normalMethod");
    }

    public static void main(String[] args) {
        ClassTest1.initVars();
        System.out.println("Value of a : " + a);
        //System.out.println("Value of b : " + b);
    }
}
