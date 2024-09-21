package excephandling;

public class ExceptionClass4 {
    public void throwInterruptedException(int value) throws InterruptedException {
        if (value < 10) {
            Thread.sleep(1000);
            throw new InterruptedException("Value is less than 10");
        }

    }

    public static void main(String[] args) {
        final ExceptionClass4 ec = new ExceptionClass4();
        try {
            ec.throwInterruptedException(5);
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block execution");
        }
    }
}
