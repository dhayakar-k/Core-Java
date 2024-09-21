package inheritance.multiple.devices;

public class SmartLight implements SmartDevice, Dimmable{


    @Override
    public void setBrightness(int level) {
        System.out.println("Setting Up the brightness level:"+level);
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to the network");
    }

    @Override
    public void performSystemCheck() {
        System.out.println("Performing system check in SmartLight");
    }
}
