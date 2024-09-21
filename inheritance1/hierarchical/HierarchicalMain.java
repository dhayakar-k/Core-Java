package inheritance.hierarchical;

import inheritance.hierarchical.compandemp.Employee1;
import inheritance.hierarchical.compandemp.Employee2;
import inheritance.hierarchical.compandemp.Employee3;
import inheritance.hierarchical.compandemp.Employee4;
import inheritance.hierarchical.parentandchild.Child1;
import inheritance.hierarchical.parentandchild.Child2;
import inheritance.hierarchical.parentandchild.Child3;

public class HierarchicalMain {

    public static void main(String[] args) {

      /*  Employee1 employee1 = new Employee1();
        employee1.initCompany("Tata Consultancy Services");
        employee1.setEmpDetails("1004", "Raghupathi", 700000);

        Employee2 employee2 = new Employee2();
        employee2.initCompany("Tata Consultancy Services");
        employee2.setEmpDetails("1005", "Rahul", 800000);

        Employee3 employee3 = new Employee3();
        employee3.initCompany("Tata Consultancy Services");
        employee3.setEmpDetails("1006", "Meghana", 900000);

        Employee4 employee4 = new Employee4();
        employee4.initCompany("Tata Consultancy Services");
        employee4.setEmpDetails("1007", "Laxman", 2000000);

        System.out.println("*****Printing EmployeesDetails*****");
        System.out.println("Emp1: Details");
        employee1.printEmpDetails();

        System.out.println();
        System.out.println("Emp2: Details");
        employee2.printEmpDetails();

        System.out.println();
        System.out.println("Emp3: Details");
        employee3.printEmpDetails();

        System.out.println();
        System.out.println("Emp4: Details");
        employee4.printEmpDetails();*/


        Child1 firstChild = new Child1("Ramana", "Subadhra");
        firstChild.setChildName("Rakesh");
        firstChild.printFirstChildDetails();


        System.out.println();
        Child2 secondChild = new Child2("Ramana", "Subadhra");
        secondChild.setChildName("Karunakar");
        secondChild.printSecondChildDetails();

        System.out.println();
        Child3 thirdChild = new Child3("Ramana", "Subadhra");
        thirdChild.setChildName("Chandhu Kumar");
        thirdChild.printFirstChildDetails();
    }
}
