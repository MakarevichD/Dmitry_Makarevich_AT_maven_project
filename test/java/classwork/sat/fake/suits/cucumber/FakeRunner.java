package classwork.sat.fake.suits.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty"},
        glue = {"week9.classwork.sat.fake.steps.fake"},
        features = {"src/test/resources/features/fake/FakeOne.feature"})
public class FakeRunner {
}
