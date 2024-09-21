package inheritance.hybrid.singlemultiple;

public interface Mother {


    default void show() {
        System.out.println("I am mother of child ");
    }
}
