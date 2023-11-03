package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="	@ValidCredentials or @InValidCredentials ",features="src/test/Features/hooks.feature",glue="com.newhrm")

public class runner {
	
	

}
