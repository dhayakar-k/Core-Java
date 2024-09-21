package staticteach.static2;

public class ABC {

    private static String city = "Hyderabad";
    private static String country = "India";

    private  String name = "xyz";
    static class NestedClass {
        static public void display() {
            System.out.println("City : " + city);
            System.out.println("Country : " + country);
            //System.out.println("name : " + name);
        }
    }
    static void makeSomething() {
        System.out.println("Something");
    }
    static class Hyderabd {
       void someMethod() {
            System.out.println("City : " + city);
            System.out.println("Country : " + country);
        }
    }

    public static void main(String[] args) {
        ABC.makeSomething();
        ABC.NestedClass.display();
        /*ABC.NestedClass abc1 = new ABC.NestedClass();
        abc1.display();*/
        ABC.Hyderabd hyd = new ABC.Hyderabd();
        hyd.someMethod();
       // ABC.NestedClass.display();
    }
}
