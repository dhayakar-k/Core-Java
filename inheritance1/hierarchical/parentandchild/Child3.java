package inheritance.hierarchical.parentandchild;

public class Child3 extends Parents {

    private String thirdChildName;
    public Child3(final String fatherName, final String motherName) {
        super(fatherName, motherName);
    }

    public void setChildName(String tChildName) {
        this.thirdChildName = tChildName;
    }
    public void printFirstChildDetails() {
        showParentsDetails();
        System.out.println("****Children3 Details****");
        System.out.println("ThirdChild Name: "+this.thirdChildName);
    }
}
