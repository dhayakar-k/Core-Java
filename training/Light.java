package training;

public class Light {

    private boolean isLightOn;

    public void turnOn() {
        if (!this.isLightOn) {
            this.isLightOn = true;
            System.out.println("Light is on");
        } else {
            System.out.println("Light is already turned on");
        }
    }

    public void turnOff() {
        if (this.isLightOn) {
            this.isLightOn = false;
            System.out.println("Light is off");
        } else {
            System.out.println("Light is already turned off");
        }
    }

    public static void main(String[] args) {
        Light light = new Light();
        System.out.println("Turning on the light...");
        light.turnOn();

        light.turnOn();

        System.out.println("Turning off the light...");
        light.turnOff();

        light.turnOff();


    }
}
