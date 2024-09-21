package polymorph.overload;

public class Test {

    static int add(int a , int b) {
        return a + b;
    }
    static double add(int b, double c) {
        return b + c;
    }
    static int add(int a , int b, int c) {
        return a + b + c;
    }

    public void multiply(double a, double b) {
        System.out.println("Multiplication of double vars, a and b: "+(a * b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication of int vars a and b "+(a * b));
    }

    public void addAndPrintString(String a, String b) {
        System.out.println("Concatenated string1: "+(a+b));
    }

    public void addAndPrintString(Character a, String b) {
        System.out.println("Concatenated string2: "+(a+b));
    }

    public void addStringBufferAndBuilder(StringBuffer a, StringBuilder b) {
        System.out.println("Concatenated string3: "+(a.append(b)));
    }

    public void addStringBufferAndBuilder(StringBuilder b, StringBuffer a, int[] a1) {
        try {

            System.out.println("Value of a1[4]: "+a1[4]);
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
            throw new RuntimeException("Cannot divide by a number by zero");
        }
        System.out.println("Concatenated string4: "+(b.append(a)));
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: "+add(2, 3));
        System.out.println("Sum of 4,5 and 6: "+add(4, 5, 6));
        System.out.println("Sum of 10 and 2.5: "+add(10,2.5));
        System.out.println();
        Test test = new Test();
        test.multiply(2, 3);
        test.multiply(2.5, 3.5);

        System.out.println();
        test.addAndPrintString("Hello", "World");
        test.addAndPrintString('H', "ello World");
        test.addStringBufferAndBuilder(new StringBuffer("Hello"), new StringBuilder("World"));
        int[] a1 =new int[]{1,3,5,6};
        test.addStringBufferAndBuilder(new StringBuilder("Hello"), new StringBuffer("World"), a1);
    }
}
