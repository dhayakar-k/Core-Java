package modifiers1;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Java Programming");
        book.author = "James Watling";
        System.out.println("*** Book Details ***");
        System.out.println("BookName: " + book.getBookName());
        System.out.println("Author: " + book.author);
    }
}
