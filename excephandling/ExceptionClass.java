package excephandling;

public class ExceptionClass {

    public static void main(String[] args) {
        int a =5;
        int b =0;
        try {
            System.out.println("Dividing a by b: "+a/b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
           // System.out.println(e.toString());
           // System.out.println(e.getMessage());
        }
    }

}
