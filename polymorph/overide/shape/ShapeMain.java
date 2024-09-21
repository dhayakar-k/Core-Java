package polymorph.overide.shape;

public class ShapeMain {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();

        shape2.draw();
    }
}
