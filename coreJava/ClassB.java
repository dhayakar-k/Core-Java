package corejava;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.salary = 5678;
        classA.firstMethod();
        System.out.println("Salary: "+classA.salary);
        classA.secondMethod();
    }
}
