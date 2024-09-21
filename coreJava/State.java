package corejava;

public class State {
    private String stateName;
    private String capital;

    private int noOfAreas;

    private String chiefMinister;

    private int districts;

    public void setStateName(String stateName) {
        if (!stateName.equals("TN")) {
            this.stateName = stateName;
        }
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public  String getCapital() {
        return this.capital;
    }

    public void setNoOfAreas(int noOfAreas) {
        this.noOfAreas = noOfAreas;
    }

    public  int getNoOfAreas() {
        return this.noOfAreas;
    }

    public void setChiefMinister(String chiefMinister) {
        this.chiefMinister = chiefMinister;
    }

    public  String getChiefMinister() {
        return this.chiefMinister;
    }

    public  void setDistricts(int districts) {
        this.districts = districts;
    }

    public  int getDistricts() {
        return this.districts;
    }

    public String toString() {
        return "{" + "stateName:"+ stateName + ",capital:"+ capital + ",noOfAreas:" +
                noOfAreas+ ",chiefMinister:" + chiefMinister + ",districts:"+ districts + "}";
    }

    public static void main(String[] args) {
        State state = new State();
        state.stateName = "AP";
        state.capital = "Amaravathi";
        state.noOfAreas = 35;
        state.chiefMinister = "CBN";
        state.districts = 40;

        System.out.println("*** State Details ***");
        System.out.println(state);
    }
}
