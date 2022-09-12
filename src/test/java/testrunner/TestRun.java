package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featuresfiles/secondScenario.feature",
        glue = "step_definition",
//        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)

public class TestRun extends AbstractTestNGCucumberTests {
}
