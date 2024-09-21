package staticteach.static1;

public class ExampleOfStatic {

    static int a = 10;
    static int b;
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

      static void staticMethod() {
          System.out.println("Inside staticMethod");
      }



    public static void main(String[] args) {
        staticMethod();
        System.out.println("Calling from main method");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
