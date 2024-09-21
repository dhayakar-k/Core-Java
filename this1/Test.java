package this1;

public class Test {

    int a ;
    int b;

    Test() {
        this(10, 20);
        System.out.println("Inside  default constructor");
    }
    public Test(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }

    void displayObject(Test test) {
        System.out.println("a = " + test.a + "  b = " + test.b);
    }

    void get1() {
        displayObject(this);
    }
    Test get() {
        return this;
    }

    public void setInfo(){
        this.display();
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.display();

        //Current class instance
        final Test test1 = test.get();
        test1.display();
        test1.get1();
        test1.displayObject(test1);
        test1.setInfo();
    }
}
