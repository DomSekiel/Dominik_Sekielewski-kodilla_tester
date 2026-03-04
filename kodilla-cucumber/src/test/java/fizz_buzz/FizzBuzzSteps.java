package fizz_buzz;

import fizzbuzz.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {
    private int number;
    private String result;

    @Given("number {int}")
    public void number(int number) {
        this.number = number;
    }

    @When("method is called")
    public void method_is_called() {
        result = FizzBuzz.getResult(number);
    }

    @Then("result should be {string}")
    public void result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
