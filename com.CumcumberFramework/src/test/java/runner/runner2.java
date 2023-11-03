package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="	@ValidCredentials or @InValidCredentials ",features="src/test/Features/hooks.feature",glue="com.newhrm")

public class runner2  extends AbstractTestNGCucumberTests {
	
	

}
 