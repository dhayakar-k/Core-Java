package inheritance.hierarchical.compandemp;

public class Company {

    private String companyName;

    long annualPackage;
    public void initCompany(final String companyName) {
        //companyName = "Google";
        this.companyName = companyName;
    }

    public void printCompanyDetails() {
        System.out.println("Company Name: "+this.companyName);
        System.out.println("Annual Package: "+this.annualPackage);
    }

}
