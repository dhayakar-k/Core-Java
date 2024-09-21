package inheritance.hierarchical.parentandchild;

public class Child1 extends Parents {

    private String firstChildName;
    public Child1(String fatherName, String motherName) {
        super(fatherName, motherName);
    }

    public void setChildName(String fChildName) {
        this.firstChildName = fChildName;
    }
    public void printFirstChildDetails() {
        showParentsDetails();
        System.out.println("****Children1 Details****");
        System.out.println("FirstChild Name: "+this.firstChildName);
    }
}
