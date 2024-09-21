package modifiers;

import corejava.State;

public class City extends State {

    public static void main(String[] args) {
        City city = new City();
        city.setStateName("Karnataka");
        city.setCapital("Bangalore");
        city.setChiefMinister("Yeddurappa");
        city.setNoOfAreas(45);
        city.setDistricts(50);

        System.out.println("*** State Details ***");
        //System.out.println(city);

        System.out.println("StateName: "+city.getStateName());
        System.out.println("Capital: "+city.getCapital());
        System.out.println("CM: "+city.getChiefMinister());
        System.out.println("NoOfAreas: "+city.getNoOfAreas());
        System.out.println("Districts: "+city.getDistricts());
    }
}
