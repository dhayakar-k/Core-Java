package modifiers1;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(47000.00);

        System.out.println("Current Available Balance: "+bankAccount.checkBalance());

        bankAccount.creditAmount(-500.00);
        bankAccount.creditAmount(450.00);
        System.out.println("Current Available Balance: "+bankAccount.checkBalance());
        System.out.println();
        bankAccount.withDrawAmount(12000.0);
        System.out.println("Current Available Balance: "+bankAccount.checkBalance());
    }
}
