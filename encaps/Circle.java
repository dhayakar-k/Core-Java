package encaps;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // PI * r^2
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // 2 * PI * r
        return 2* Math.PI * radius ;
    }
}
