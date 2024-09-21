package polymorph.overide.animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meowing...");
    }
}
