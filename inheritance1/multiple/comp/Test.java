package inheritance.multiple.comp;

public class Test implements Siemens, Atlassian {
    @Override
    public void name() {
        Siemens.super.name();
        Atlassian.super.name();
    }

    public void ofNameOfSiemens() {
        Siemens.super.name();
    }

    public void ofNameOfAtlassian() {
        Atlassian.super.name();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.name();
        System.out.println("Now Calling Test Methods which internally Calls Siemens and Atlassian Method");
        test.ofNameOfSiemens();
        test.ofNameOfAtlassian();
    }
}
