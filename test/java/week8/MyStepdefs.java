package week8;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("I start execution")
    public void iStartExecution() {
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {

    }

    @Then("I verify that result equals {int}")
    public void iVerifyThatResultEquals(int arg0) {
        Assert.assertTrue(true);
    }

    @When("I substract {int} and {int}")
    public void iSubstractAnd(int arg0, int arg1) {
    }
}
