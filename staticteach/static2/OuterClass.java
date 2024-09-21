package staticteach.static2;

public class OuterClass {

    static int outerA = 15;
    int outerB = 25;

    private static int outerPrivate = 40;

    static class InnerClass {
        static void display() {
            // Can access a static member of the outer class
            System.out.println("Outer A : " + outerA);
            // Can access a static member of the outer class
            System.out.println("Outer Private : " + outerPrivate);

            // But cannot access non-static member of  outer class, compiler will throw
            //System.out.println("Outer B : " + outerB);
            // To access non-static  outer member we can create a class object and access.
            OuterClass outerClass = new OuterClass();
            outerClass.outerB = 50;
            System.out.println("non static outer B : " + outerClass.outerB);
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
        // If the method is static inside the inner class, we can call it directly.
        //OuterClass.InnerClass.display();
    }
}
