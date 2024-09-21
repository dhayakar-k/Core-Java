package polymorph.overide.bank;

public class HDFC extends BankClass {

    @Override
    public float getRateOfInterest() {
        return 8.5f;
    }
}
