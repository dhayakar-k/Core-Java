package staticteach.static2;

public class Animal {

     class Reptile {
      public void showInfo() {
        System.out.println("I am a reptile.");
      }
    }

    static class Mammal {
        public static void showInfo() {
            System.out.println("I am a mammal.");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        //Animal.Reptile reptile = new Animal().new Reptile();
        Animal.Reptile reptile = animal.new Reptile();
        reptile.showInfo();

        Mammal mammal = new Animal.Mammal();
        mammal.showInfo();
        Mammal.showInfo();
    }
}
