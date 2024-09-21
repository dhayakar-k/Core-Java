package inheritance.multilevel.shape;

public class Rectangle extends Shape {

    public void area() {
        super.display();
        System.out.println("Area of a rectangle");
    }
}
