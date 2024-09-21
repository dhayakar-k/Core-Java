package inheritance.hierarchical.parentandchild;

public class Parents {

    private String fatherName;
    private String motherName;

    public Parents(final String fatherName, final String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public void showParentsDetails() {
        System.out.println("****Parent Details****");
        System.out.println("FatherName: "+this.fatherName);
        System.out.println("MotherName: "+this.motherName);
    }
}
