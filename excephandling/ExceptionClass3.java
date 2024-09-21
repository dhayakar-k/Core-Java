package excephandling;

public class ExceptionClass3 {

    public void throwNullPointerException() throws NullPointerException {
        String plName = null;
        System.out.println(plName.toString());

    }

    public static void main(String[] args) {
        final ExceptionClass3 ec = new ExceptionClass3();
        try {
            ec.throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block execution");
        }
    }
}
