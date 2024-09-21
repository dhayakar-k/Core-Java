package inheritance.hybrid.singlehier;

public class GrandMother {
    public void showGrandMotherDetails(String mother, String child1, String child2, String gm) {
        System.out.println("I am grandMother MyName is : "+gm);
        System.out.println("I am "+ gm +" Mother of : "+mother);
        System.out.println("I am "+gm + " Grand Mother of: "+child1+ " and "+child2);
    }
}
