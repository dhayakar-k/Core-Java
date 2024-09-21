package abstraction.animal;

public class Cat extends Animal {


    public Cat(final String catName) {
        super(catName);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says meow meow");
    }
}
