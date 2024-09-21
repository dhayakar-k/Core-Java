package training;

public class Employee {
    String firstName;
    String lastName;
    String company;
    int age;
    String gender;
    double salary;

    /*public void addData(String firstName, String lastName, String company, int age, String gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
*/
   /* public void printData() {
        System.out.println("Employee Details:");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Company:"+company);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Salary: "+salary);
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee() {
    }
    public Employee(String firstName, String lastName, String company, int age, String gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee tcsEmp = new Employee("Raj", "Kumar", "Tata Consultancy Services", 27, "Male", 50000.00);
        System.out.println("TCS EmployeeDetails: "+tcsEmp.toString());

        System.out.println();
        Employee infosysEmp = new Employee("Rahul", "Kasani", "Infosys", 28, "Male", 60000.00);
        System.out.println("Infosys EmployeeDetails: "+infosysEmp.toString());
        System.out.println();

        Employee wiproEmp = new Employee();
        wiproEmp.setFirstName("Bixhapathi");
        wiproEmp.setLastName("kadari");
        wiproEmp.setCompany("Wipro");
        wiproEmp.setAge(25);
        wiproEmp.setGender("Male");
        wiproEmp.setSalary(75000.00);

        System.out.println("Wipro EmployeeDetails: ");
        System.out.println("FirstName: "+wiproEmp.getFirstName());
        System.out.println("LastName: "+wiproEmp.getLastName());
        System.out.println("Company: "+wiproEmp.getCompany());
        System.out.println("Age: "+wiproEmp.getAge());
        System.out.println("Gender: "+wiproEmp.getGender());
        System.out.println("Salary: "+wiproEmp.getSalary());

        System.out.println("Wipro EmployeeDetails: "+wiproEmp.toString());

    }
}
