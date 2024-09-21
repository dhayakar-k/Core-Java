package excephandling;

public class ExceptionClass6 {

    public void throwClassNotFoundException() throws ClassNotFoundException {
        // This will throw ClassNotFoundException because class with Name com.mysql.jdbc.Driver is not found
        // This is a checked exception
        // ExceptionClass10
        /*Class<?> aClass = Class.forName("excephandling.ExceptionClass11");
        System.out.println("ClassName: "+aClass.getName());*/
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        System.out.println("ClassName: "+aClass.getName());

    }

    public static void main(String[] args) {
        final ExceptionClass6 ec = new ExceptionClass6();
        try {
            ec.throwClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block execution");
        }
    }
}
