package polymorph.overide.animal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barking...");
    }
}
