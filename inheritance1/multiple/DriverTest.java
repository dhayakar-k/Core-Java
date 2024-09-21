package inheritance.multiple;

import inheritance.multiple.pare.Parent1;
import inheritance.multiple.pare.Parent2;

public class DriverTest extends Parent1 //, Parent2 {
{

    public static void main(String[] args) {
        DriverTest dTest = new DriverTest();
        dTest.gParent();
        dTest.call();
    }
}
