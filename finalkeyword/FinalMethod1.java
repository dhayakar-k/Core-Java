package finalkeyword;

public class FinalMethod1 extends FinalMethod {

    @Override
    public void displayInfo1() {
        super.displayInfo();
        super.displayInfo1();
        System.out.println("Child display information");
    }
   /* public final void displayInfo() {
        System.out.println("This is a final method.");
    }*/

    public static void main(String[] args) {
        FinalMethod1 finalMethod1 = new FinalMethod1();
        finalMethod1.displayInfo1();
    }

}
