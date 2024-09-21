package corejava;

public class Employee {

    private String firstName;
    private String lastName;
    private String company;
    private int age;
    private Long annualCtc;
    private String officeLocation;
    private String gender;

    /*public void initVariables(String firstName, String lastName, String company, int age, Long annualCtc,
                              String officeLocation, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.age = age;
        this.annualCtc = annualCtc;
        this.officeLocation = officeLocation;
        this.gender = gender;
    }*/

    public Employee(String firstName, String lastName, String company, int age, Long annualCtc,
                         String officeLocation, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.age = age;
        this.annualCtc = annualCtc;
        this.officeLocation = officeLocation;
        this.gender = gender;
    }

    public void printData() {
        System.out.println("FirsName: " + this.firstName);
        System.out.println("LastName: " + this.lastName);
        System.out.println("Company: " + this.company);
        System.out.println("Age: " + this.age);
        System.out.println("AnnualCTC: " + this.annualCtc);
        System.out.println("OfficeLocation: " + this.officeLocation);
        System.out.println("Gender: " + this.gender);
    }
    //public void showDetails();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                ", annualCtc=" + annualCtc +
                ", officeLocation='" + officeLocation + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kadari", "Bixapathi", "TCS", 23, 360000L,
                      "Hyderabad", "Male");
        //Employee emp1 = emp.clone();
        //emp.initVariables("Kadari", "Bixapathi", "TCS", 23, 360000L,
         //       "Hyderabad", "Male");
        //emp.printData();
        System.out.println("Employee Details:");
        System.out.println(emp);
    }


}
