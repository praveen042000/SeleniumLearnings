package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/Features/hooks.feature",glue="com.newhrm")

public class runner2  extends AbstractTestNGCucumberTests {
	
	

}
