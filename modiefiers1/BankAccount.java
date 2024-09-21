package modiefiers1;

public class BankAccount {

    public double balance;

    public BankAccount() {

    }
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void creditAmount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            //balance += amount;
            System.out.println("Amount "+amount+ " Credited successfully");
        } else {
            System.out.println("Invalid Amount and amount should not be negative");
        }
    }

    public  void withDrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal amount "+ amount + ", Remaining Balance: "+balance);
        } else {
            System.out.println("Withdrawal amount "+ amount + " Cannot be negative");
        }
    }

    public double checkBalance() {
        //System.out.println("Current Available Balance: "+balance);
        return this.balance;
    }

}
