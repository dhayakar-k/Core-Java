package clone;

import java.lang.reflect.Constructor;

public class Tutorial implements Cloneable {

    private String tutorial;

    private String batchStartDate;

    private String batchEndDate;

    private double fee;

    int maxNoOfStudents;

    private int currentNoOfStudents;

    @Override
    public Tutorial clone() throws CloneNotSupportedException {
        return (Tutorial) super.clone();
    }

    public Tutorial() {

    }

    protected void addDetails(String tuto, String startDate, String endDate, double coachingFee, int maxStudents, int currentNoOfStudents) {
        System.out.println("This is the Default method");
        this.tutorial = tuto;
        this.batchStartDate = startDate;
        this.batchEndDate = endDate;
        this.fee = coachingFee;
        this.maxNoOfStudents = maxStudents;
        this.currentNoOfStudents = currentNoOfStudents;
    }

    protected void showDetails() {
        System.out.println("**** SpringBoot Training Details ***");
        System.out.println("Tutorial Name: "+this.tutorial);
        System.out.println("BatchStartDate: "+this.batchStartDate);
        System.out.println("BatchEndDate: "+this.batchEndDate);
        System.out.println("CoachingFee: "+this.fee);
        System.out.println("MaxNoOfStudents: "+this.maxNoOfStudents);
        System.out.println("CurrentNoOfStudents: "+this.currentNoOfStudents);
    }


    public Tutorial(String tuto, String startDate, String endDate, double coachingFee, int maxStudents, int currentNoOfStudents) {
        this.tutorial = tuto;
        this.batchStartDate = startDate;
        this.batchEndDate = endDate;
        this.fee = coachingFee;
        this.maxNoOfStudents = maxStudents;
        this.currentNoOfStudents = currentNoOfStudents;
    }

    public String toString() {
        return "{" + "tutorial: " + tutorial +
                ", batchStartDate: " + batchStartDate +
                ", batchEndDate: " + batchEndDate +
                ", fee: " + fee +
                ", maxNoOfStudents: " + maxNoOfStudents +
                ", currentNoOfStudents: " + currentNoOfStudents + "}";
    }

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException {
        Tutorial java = new Tutorial("Core Java", "2024-07-22", "2024-08-31",
                45000.00, 5, 3);
        System.out.println("Java Batch1 Details: " + java);

        Tutorial java1 = java.clone();
        System.out.println("Java Batch2 Details: " + java1);

        Constructor<Tutorial> java2 = Tutorial.class.getDeclaredConstructor();
        System.out.println("CLassName: " + java2);
    }

}
