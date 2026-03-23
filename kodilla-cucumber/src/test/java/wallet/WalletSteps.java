package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class WalletSteps {

    private Wallet wallet;
    private CashSlot cashSlot;
    private Cashier cashier;

    private int initialBalance;
    private boolean withdrawalSuccess;
    private int checkedBalance;

    @Given("there is ${int} in my wallet")
    @Given("my wallet balance is ${int}")
    public void walletHasBalance(int amount) {
        wallet = new Wallet();
        wallet.deposit(amount);

        cashSlot = new CashSlot();
        cashier = new Cashier(cashSlot);

        initialBalance = amount;
    }

    @When("I deposit ${int}")
    public void iDeposit(int amount) {
        wallet.deposit(amount);
    }

    @When("I withdraw ${int}")
    @When("I request ${int}")
    public void iWithdrawOrRequest(int amount) {
        cashier.withdraw(wallet, amount);

        withdrawalSuccess = cashSlot.getContents() > 0;
    }

    @When("I check the balance of my wallet")
    public void iCheckBalance() {
        checkedBalance = wallet.getBalance();
    }

    @Then("the balance of my wallet should be ${int}")
    public void balanceShouldBe(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }

    @Then("${int} should be dispensed")
    @Then("I should receive ${int}")
    public void amountShouldBeDispensed(int expectedAmount) {
        assertEquals(expectedAmount, cashSlot.getContents());
    }

    @Then("nothing should be dispensed")
    public void nothingShouldBeDispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("the withdrawal should be rejected")
    public void withdrawalShouldBeRejected() {
        assertFalse(withdrawalSuccess);
        assertEquals(0, cashSlot.getContents());
    }

    @Then("the balance of my wallet should remain ${int}")
    public void balanceShouldRemain(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
        assertEquals(initialBalance, wallet.getBalance());
    }

    @Then("I should see that the balance is ${int}")
    public void iShouldSeeBalance(int expectedBalance) {
        assertEquals(expectedBalance, checkedBalance);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void iShouldBeToldNotEnoughMoney() {
        assertEquals("Not enough money in wallet", cashier.getMessage());
    }
}