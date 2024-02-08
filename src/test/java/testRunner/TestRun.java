package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/regestration.feature",
		glue="stepDefenations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-cucumber"}
		)

public class TestRun {

}
