package training;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Bixapathi";
        student.emailId = "bixpathi@gmail.com";
        student.age = 21;

        System.out.println("Student name:"+student.name);
        System.out.println("Student emailId:"+student.emailId);
        System.out.println("Student age:"+student.age);

        //Student student = new Student("Shyam", "shyam123@gmail.com", 29);
        //student.insertData("Ram", "ram.124@gmail.com", 25);
        //student.printData();

    }
}
