package inheritance.hybrid.singlemultiple;

public interface Father {

    default void show() {
        System.out.println("I am father of child ");
    }
}
