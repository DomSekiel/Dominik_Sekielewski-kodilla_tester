package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() { }

    public void deposit(int money) {
        if (money < 0) throw new IllegalArgumentException("Cannot deposit negative money");
        this.balance += money;
    }

    public void debit(int money) {
        if (money > balance || money <= 0) {
            return;
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}