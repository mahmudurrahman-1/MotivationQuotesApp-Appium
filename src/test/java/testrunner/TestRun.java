package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featuresfiles/firstScenario.feature",
        glue = "step_definition"
)

public class TestRun extends AbstractTestNGCucumberTests {
}
