package testRunner;

import org.apache.logging.log4j.LogManager;
import testUtility.TestBase;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;

import cleverMediaPages.FormPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/Features/formfiller.feature",
		glue={"stepDefinitions"}
		)
public class FormFillerRunner extends AbstractTestNGCucumberTests {
	
}
