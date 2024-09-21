package training;

public class Student {
    String name;
   String emailId;
   int age;

   /* public void insertData(String name, String emailId, int age) {
        this.name = name;
        this.emailId = emailId;
        this.age = age;
    }*/
 /*  public Student(String name, String emailId, int age) {
       this.name = name;
       this.emailId = emailId;
       this.age = age;
   }*/


    public void printData() {
        System.out.println("Student name: "+name);
        System.out.println("Student emailId: "+emailId);
        System.out.println("Student age: "+age);
    }

}
