package abstraction.animal;

public class AnimalMain {

    public static void main(String[] args) {
        final Dog dog = new Dog("Puppy");
        System.out.println("Dog Name: " + dog.getName());
        dog.makeSound();
        dog.eat();
        System.out.println();
        final Cat cat = new Cat("Chinnu");
        System.out.println("Cat Name: " + cat.getName());
        cat.makeSound();
        cat.eat();
    }
}
