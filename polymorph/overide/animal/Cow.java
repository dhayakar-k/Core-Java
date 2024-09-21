package polymorph.overide.animal;

public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow mooing...");
    }
}
