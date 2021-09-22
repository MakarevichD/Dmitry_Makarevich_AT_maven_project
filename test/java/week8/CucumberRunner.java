package week8;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {""},
        features = {
                "src/test/resources/features/demoCucumber.feature"
        },
        strict = true)
public class CucumberRunner {



}
