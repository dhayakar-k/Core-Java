package accessmod;

import modifiers1.BankAccount;

public class ModifiersMain extends BankAccount {

    double howMuchIWantAdd;
    public double showBalance() {
        super.checkBalance();
        return balance + howMuchIWantAdd ;
    }
    public ModifiersMain(double balance) {
        super(balance);
    }
    public static void main(String[] args) {
        ModifiersMain bankAccount = new ModifiersMain(50000.00);
        bankAccount.howMuchIWantAdd = 5000.00;
        System.out.println("Current Balance :"+bankAccount.showBalance());
        //bankAccount.creditAmount();
        //bankAccount.checkBalance();

       /* bankAccount.creditAmount(5000.00);
        bankAccount.checkBalance();

        bankAccount.withDrawAmount(8500.00);
        bankAccount.checkBalance();*/
    }
}
