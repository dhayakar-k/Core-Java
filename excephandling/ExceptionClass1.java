package excephandling;

public class ExceptionClass1 {

    protected String getPlName() {
        return null; // java
    }

    public static void main(String[] args) {
        String plName = new ExceptionClass1().getPlName();
        System.out.println(plName.toLowerCase());
    }
}
