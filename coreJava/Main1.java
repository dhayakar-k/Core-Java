package corejava;

import corejava.State;

public class Main1 {

    public void m1() {
        System.out.println("Iam M1");
    }
    public void m2() {
        m1();
    }

    public static void main(String[] args) {
        State state = new State();
        state.setStateName("Telangana");
        state.setCapital("Hyderabad");
        state.setNoOfAreas(30);
        state.setChiefMinister("Revanth");
        state.setDistricts(33);

        System.out.println("*** State Details ***");
        System.out.println(state);
    }
}
