package inheritance.multiple.devices;

public class SmartHomeAssistant implements SmartDevice, MusicPlayer, Dimmable{
    @Override
    public void setBrightness(int brightnessLevel) {
        System.out.println("Setting Up the brightness level: "+brightnessLevel);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Bhakthi songs");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to the network");
    }

    @Override
    public void performSystemCheck() {
        System.out.println("Performing the system check");
    }
}
