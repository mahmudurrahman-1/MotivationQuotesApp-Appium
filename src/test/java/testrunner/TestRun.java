package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //It includes feature files when test steps are defined
        features = "src/test/java/featuresfiles/thirdScenario.feature",
        //It includes implementation of feature files and divers
        glue = "step_definition"
//        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)

public class TestRun extends AbstractTestNGCucumberTests {
}
