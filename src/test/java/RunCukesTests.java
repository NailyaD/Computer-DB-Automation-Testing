import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * RunCukesTest
 * Class for running tests.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "io.gatling",
        strict = true,
        tags = "@addition"
)
class RunCukesTest {

}
