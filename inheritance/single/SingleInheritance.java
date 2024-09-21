package inheritance.single;

import inheritance.single.animal.Dog;
import inheritance.single.phone.SmartPhone;

public class SingleInheritance {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();
        smartPhone.sendText();
        smartPhone.takePhoto();
        smartPhone.browseInternet();
        smartPhone.playGame();

        Dog labrador  = new Dog();
        labrador.name = "Rohu";
        labrador.display();
        labrador.bark();
        labrador.eat("Rohu");
    }
}
