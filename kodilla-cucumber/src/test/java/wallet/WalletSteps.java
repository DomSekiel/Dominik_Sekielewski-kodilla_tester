package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private Wallet wallet;
    private CashSlot cashSlot;

    //@Given("I have deposited $200 in my wallet")
    //public void i_have_deposited_$200_in_my_wallet() {

    //    wallet.deposit(200);
    //    assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    //

    //@When("I request $30")
    //public void i_request_$30() {
    //Cashier cashier = new Cashier(cashSlot);
    //cashier.withdraw(wallet, 30);
    //}

    //@Then("$30 should be dispensed")
    //public void $30_should_be_dispensed() {
    //   assertEquals(30, cashSlot.getContents());
    //}

    //@Then("the balance of my wallet should be $170")
    //public void the_balance_of_my_wallet_should_be_$170() {
    //    assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
    //}

    @Given("my wallet balance is {int}")
    public void my_wallet_balance_is(int balance) {
        wallet = new Wallet();
        wallet.deposit(balance);
        cashSlot = new CashSlot();
    }

    @When("I request ${int}")
    public void i_request_amount(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void amount_should_be_dispensed(int expected) {
        assertEquals(expected, cashSlot.getContents(), "Incorrect dispensed amount");
    }

    @Then("the balance of my wallet should be ${int}")
    public void wallet_balance_should_be(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Then("the withdrawal should be rejected")
    public void withdrawal_should_be_rejected() {
        assertEquals(0, cashSlot.getContents(), "Cash slot should be empty when withdrawal is rejected");
    }

    @Then("the balance of my wallet should remain ${int}")
    public void wallet_balance_should_remain(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Wallet balance should remain unchanged after rejected withdrawal");
    }
}