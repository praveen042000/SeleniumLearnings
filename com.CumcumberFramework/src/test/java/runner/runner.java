package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="	@ValidCredentials  ",features="src/test/Features/hooks.feature",glue="com.newhrm",plugin = {"pretty","html:target/Cucumber-reports/Cucumber.html"})

public class runner {
	
	

}
