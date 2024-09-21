package inheritance.hierarchical.compandemp;

import inheritance.hierarchical.compandemp.Company;

public class Employee2 extends Company {

    private String id;
    private String empName;

    public void setEmpDetails(final String empId, String employeeName, long annualCTC) {
        this.id = empId;
        this.empName = employeeName;
        this.annualPackage = annualCTC;
    }

    public void printEmpDetails() {
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+empName);
        printCompanyDetails();
    }
}
