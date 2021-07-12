 package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(
		 features = "FeatureFiles",
		 glue= {"stepDefinitions","baseinit"},
		plugin = {"reporter.ExtentCucumberAdapter:","json:test-output/cucumber-JSON-report/JSONReport.json","rerun:test-output/RerunCases/rerun.txt","junit:test-output/cucumber-XML-report/XMLReport.xml"},
		 monochrome = true,
		 dryRun = false		 
		 ,tags = {"@Yes","not @No"}
 )

public class Runner {
	
	
	
	}
