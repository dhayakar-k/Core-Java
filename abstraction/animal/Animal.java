package abstraction.animal;

public abstract class Animal {

    private String name;

    public Animal(final String animalName) {
        this.name = animalName;
    }
    abstract void makeSound();

    public void eat() {
        System.out.println("Animal "+ this.name +" is Eating");
    }

    public String getName() {
        return this.name;
    }
}
