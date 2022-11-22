package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/com/Feature",glue = {"stepDefinition"},
monochrome = true,
plugin = {"pretty","junit:target/jUnitReports/report.xml",
		"json:target/JSONReports/report.xml",
		"html:target/HtmlReports"
		
		
		})
public class TestRunner {
	

}
