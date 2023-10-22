public class account {
    private String name;
    private String accountNumber;
    private double balance;

    public account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " is successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " is successful. New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }

    }

    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: $" + balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}