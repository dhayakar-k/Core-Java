package inheritance.multiple.comp;

public interface Atlassian {

    //void cityHQ();
    default void name() {
        System.out.println("Atlassian Pvt Ltd");
    }
}
