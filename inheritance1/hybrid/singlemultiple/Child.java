package inheritance.hybrid.singlemultiple;

public class Child extends Parents implements Mother, Father {
    @Override
    public void show() {
        Mother.super.show();
        Father.super.show();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.displayParents();
        child.show();
    }
}
