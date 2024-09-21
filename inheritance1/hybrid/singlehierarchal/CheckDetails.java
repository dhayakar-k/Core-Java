package inheritance.hybrid.singlehier;

public class CheckDetails {

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.showGrandMotherDetails("Eshawaramma", "Rani", "Ram", "Gundamma");
        daughter.show("Ram", "Rani");
        daughter.show("Eshawaramma");

        System.out.println();
        Son son = new Son();
        son.showGrandMotherDetails("Lakshmi", "Mahesh", "Supriya", "Buchamma");
        daughter.show("Mahesh", "Supriya");
        daughter.show("Lakshmi");
    }
}
