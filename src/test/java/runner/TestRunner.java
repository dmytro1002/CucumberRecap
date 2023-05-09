package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber-report/cucumber.json",
                  "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@EAV-1",
        publish = true,
        monochrome = true

)
public class TestRunner {

}
