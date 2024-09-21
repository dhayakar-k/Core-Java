package corejava;

public class Student {

    private String name;

    private int age;

    private String college;

    public void addStudentDetails(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public void showDetails() {
        System.out.println("*** Student Details ***");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("College: "+this.college);
    }

    public static void main(String[] args) {
        try {
            Class clas1 = Class.forName("corejava.Student");
            Student student = (Student) clas1.newInstance();
            student.addStudentDetails("John", 18, "CBIT");
            student.showDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
