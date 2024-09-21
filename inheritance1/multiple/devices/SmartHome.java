package inheritance.multiple.devices;

public class SmartHome {

    public static void main(String[] args) {
        SmartHomeAssistant sha = new SmartHomeAssistant();
        sha.connectToNetwork();
        sha.performSystemCheck();
        sha.setBrightness(5);
        sha.playMusic();
        System.out.println();
        SmartLight smartLight = new SmartLight();
        smartLight.connectToNetwork();
        smartLight.performSystemCheck();
        smartLight.setBrightness(10);

        System.out.println();

        SmartSpeaker ss = new SmartSpeaker();
        ss.connectToNetwork();
        ss.performSystemCheck();
        ss.playMusic();
    }
}
