package excephandling;

public class ExceptionClass2 {

    public void divide(final int a, final int b) {
        try {
            System.out.println("Dividing a by b: " + a / b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("cannot divide a number by zero");
        }
    }

    public void throwArrayIndexOutOfBoundsException(int index) {
        int[] arr;
        arr = new int[] { 1, 2, 3, 4, 5 };
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        }
    }

    public static void main(String[] args) {
        final ExceptionClass2 ec = new ExceptionClass2();
        try {
            ec.divide(5, 0);
            //ec.throwArrayIndexOutOfBoundsException(6);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception caught: " + e1.getMessage());
        } finally {
            System.out.println("Finally block executed");
            try {
                ec.throwArrayIndexOutOfBoundsException(6);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Exception caught: " + e1.getMessage());
            }
        }
    }
}
