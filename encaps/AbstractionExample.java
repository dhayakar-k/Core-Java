package encaps;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class AbstractionExample {

    public static void main(String[] args) {
        Circle circle = new Circle(2.43);
        System.out.println("Area of Circle: "+circle.calculateArea());
        System.out.println("Perimeter of Circle: "+circle.calculatePerimeter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("Area of Rectangle: "+rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: "+rectangle.calculatePerimeter());



    }
}
