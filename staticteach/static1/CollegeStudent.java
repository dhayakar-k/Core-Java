package staticteach.static1;

public class CollegeStudent {
    String studentName;
    int rollNo;

    static String clgName;
    static int counter = 0;

    public CollegeStudent(String studentName) {
        this.studentName = studentName;
        this.rollNo = getRollNumber();
    }

    static int getRollNumber() {
        counter++; // counter = counter +1;
        return counter;
    }

    static void setCollege(final String collegeName) {
        CollegeStudent.clgName = collegeName;
    }

    void printStudentInfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("College Name : " + clgName);
        System.out.println();
    }

    public static void main(String[] args) {
        CollegeStudent.setCollege("Guru Nanak Engineering College");
        CollegeStudent student1 = new CollegeStudent("John");
        student1.printStudentInfo();
        CollegeStudent student2 = new CollegeStudent("Doe");
        student2.printStudentInfo();
        CollegeStudent student3 = new CollegeStudent("Ram");
        student3.printStudentInfo();
        CollegeStudent student4 = new CollegeStudent("Shyam");
        student4.printStudentInfo();
        CollegeStudent student5 = new CollegeStudent("Rakesh");
        student5.printStudentInfo();
        CollegeStudent student6 = new CollegeStudent("Venky");
        student6.printStudentInfo();
        CollegeStudent student7 = new CollegeStudent("Madhu");
        student7.printStudentInfo();
    }
}
