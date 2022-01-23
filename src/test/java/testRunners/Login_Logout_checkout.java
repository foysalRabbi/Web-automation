package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/Features.TestSuite_01"},
        glue={"stepDefinition"}
      //  plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Login_Logout_checkout {
}
