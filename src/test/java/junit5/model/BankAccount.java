package junit5.model;

public class BankAccount {
    private Integer balance;

    public BankAccount(Integer balance) {
        this.balance = balance;
    }


    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public Integer getBalance() {
        return balance;
    }
}
