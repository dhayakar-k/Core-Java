package modifiers;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 20);
        car.displayCarDetails();

        Book book = new Book();
        book.title = "Java Programming";
        book.setAuthor("John Doe");

        System.out.println("Title: " + book.title);
        System.out.println("Author: "+ book.getAuthor());
    }
}
