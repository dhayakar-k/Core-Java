package inheritance.single.phone;

public class SmartPhone extends Phone {

    public void takePhoto() {
        super.phoneType = "Old Model";
        System.out.println("Taking photo..");
    }
    public void browseInternet() {
        System.out.println("Browsing internet..");
    }

    public void playGame() {
        System.out.println("Playing game..");
    }

}
