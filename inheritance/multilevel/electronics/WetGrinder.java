package inheritance.multilevel.electronics;

public class WetGrinder extends Grinder {

        public WetGrinder() {
            super();
            System.out.println("Class is WetGrinder");
        }

        public void grindingTech() {
            System.out.println("Type: - WetGrinder, Grinding Technology");
        }
}
