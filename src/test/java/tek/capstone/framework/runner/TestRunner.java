package tek.capstone.framework.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(

		tags = "@Smoke", 
		features = ("classpath:features"), 
		glue = ("tek.capstone.framework"), 
		dryRun = false, 
		plugin = {
				"pretty", 
				"html:target/HTMLReports/report.html", 
				"json:target/jsonReports/report.json",
				"junit:target/JUnitReports/report.xml" }, 
		snippets = CAMELCASE, 
		monochrome = true

)

public class TestRunner {

}
