package clone;

public class JavaTutorial1 {

    public static void main(String[] args) {
        Tutorial javaTuto = new Tutorial();
        javaTuto.addDetails("SpringBoot", "2024-08-12", "2024-09-20", 40000.00, 10, 7);
        javaTuto.showDetails();
        Tutorial javaTuto1 = new Tutorial();
        javaTuto1.addDetails("Spring", "2024-08-13", "2024-09-15", 47000.00, 15, 10);
        javaTuto1.showDetails();


    }
}
