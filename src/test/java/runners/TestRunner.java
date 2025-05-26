package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"stepdefinitions", "hooks"},
        features = {"src/test/java/features"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
