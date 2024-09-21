package polymorph.overide.parents;

public class OverloadMain {

    public static void main(String[] args) {
      /*  Parent parent1 = new Parent();
        parent1.showInfo();*/
        // Here in this program, When an object of a child class is created, then the method inside the child class is called.
        // This is because The method in the parent class is overridden by the child class. Since The method is overridden,
        // This method has more priority than the parent method inside the child class. So, the body inside the child class is executed.
        System.out.println("====================================");
        Parent parent;
        parent = new Child1();
        parent.showInfo();
        System.out.println("====================================");
        parent = new Child2();
        parent.showInfo();
        System.out.println("====================================");
        parent = new Child3();
        parent.showInfo();

    }
}
