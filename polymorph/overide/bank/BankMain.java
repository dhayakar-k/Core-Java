package polymorph.overide.bank;

public class BankMain {

    public static void main(String[] args) {
        BankClass icici = new ICICI();
        BankClass kotak = new Kotak();
        BankClass sbi = new SBI();
        BankClass hdfc = new HDFC();
        BankClass idbi= new IDBI();
       // icici.getRateOfInterest();
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("Kotak Rate of Interest: " + kotak.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: " + hdfc.getRateOfInterest());
        System.out.println("IDBI Rate of Interest: " + idbi.getRateOfInterest());
    }
}
