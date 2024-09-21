package abstraction.animal;

public class Dog extends Animal {

    public Dog(final String dogName) {
        super(dogName);
    }

    @Override
    void makeSound() {
        System.out.println("Dog is Barking");
    }
}
