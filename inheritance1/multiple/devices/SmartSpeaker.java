package inheritance.multiple.devices;

public class SmartSpeaker implements SmartDevice,MusicPlayer{

    @Override
    public void connectToNetwork() {
        System.out.println("Checking n/w connection");
        System.out.println("Connected to network");
    }

    @Override
    public void performSystemCheck() {
        System.out.println("Performing system check");
        System.out.println("System check done");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music on SmartSpeaker");
    }
}
