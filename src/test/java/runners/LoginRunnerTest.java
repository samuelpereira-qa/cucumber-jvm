package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "steps",
        plugin = {"pretty",
                "html:target/cucumber-report/login",
                "json:target/cucumber-report/login/cucumber.json"}
)
public class LoginRunnerTest {


}
