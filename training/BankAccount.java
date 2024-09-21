package training;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    protected void deposit(double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
            System.out.println(amount +" Deposited Successfully ");
        } else {
            System.out.println("Invalid amount");
        }
    }

    protected void withdraw(double amount) {
        if(amount > 0 && amount < balance) {
            this.balance = balance - amount;
            System.out.println(amount +" Withdrawn Successfully ");
        } else {
            System.out.println("Invalid amount");
        }
    }

    protected void checkBalance() {
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50000.00);
        bankAccount.checkBalance();
        bankAccount.deposit(20000.00);
        System.out.println("Current Balance after deposit of 2000.00 ");
        bankAccount.checkBalance();

        bankAccount.withdraw(10000.00);
        System.out.println("Current Balance after withdrawing of 10000.00.00 ");
        bankAccount.checkBalance();
    }
}
