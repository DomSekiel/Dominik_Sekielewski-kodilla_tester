package wallet;

public class Cashier {
    private final CashSlot cashSlot;
    private String message;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= 0 || amount > wallet.getBalance()) {
            cashSlot.clear();
            message = "Not enough money in wallet";
        } else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            message = null;
        }
    }
    public String getMessage() {
        return message;
    }
}