package classwork.sat.fake.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import driver.Config;
import driver.Driver;

public class FakeGuiSteps {

    @Given(value = "I go to pikabu.ru")
    public void checkHeaderTest(){
        Driver.getDriver(Config.CHROME).get("https://pikabu.ru");

        }

    @When("i start waiting")
    public void iStartWaiting() throws InterruptedException {
        Thread.sleep(100);

    }

    @Then("I just passed")
    public void iJustPassed() {
        Assert.assertTrue(true);
    }
}

