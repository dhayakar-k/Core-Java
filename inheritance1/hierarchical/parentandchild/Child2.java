package inheritance.hierarchical.parentandchild;

public class Child2 extends Parents {

    private String secondChildName;
    public Child2(final String fatherName, final String motherName) {
        super(fatherName, motherName);
    }

    public void setChildName(String sChildName) {
        this.secondChildName = sChildName;
    }
    public void printSecondChildDetails() {
        showParentsDetails();
        System.out.println("****Children2 Details****");
        System.out.println("SecondChild Name: "+this.secondChildName);
    }
}
