package inheritance.single.animal;

public class Dog extends Animal {

    public void display() {
        //super.name = "Puppy";
        System.out.println("Dog name: " + name);
    }

    public void bark() {
        System.out.println("Barking..");
    }

    @Override
    public void eat(String name) {
        super.eat(name);
        System.out.println("Dog is eating..");
    }
}
