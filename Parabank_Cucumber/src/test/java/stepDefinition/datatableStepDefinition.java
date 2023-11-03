package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.parabank.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatableStepDefinition {
	@Given("User is on HRMLogin Webpage")
	public void user_is_on_hrm_login_webpage() {
	  HelperClass.openPage("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User provides valid credentials")
	public void user_provides_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Credentials Entered");
		   List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
		   for (Map<String,String> form : signUpForm) {
			   String UserName = form.get("username");
			   System.out.println("USername : " + UserName);
			   HelperClass.getDriver().findElement(By.name("username")).sendKeys(UserName);
			   String PassWord = form.get("password");
			   System.out.println("USername : " + PassWord);
			   HelperClass.getDriver().findElement(By.name("password")).sendKeys(PassWord);
			   
			   HelperClass.getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
			   
		   }
	}

	@Then("USer should be able to login successfully and see homepage")
	public void u_ser_should_be_able_to_login_successfully_and_see_homepage() {
		 Assert.assertTrue(HelperClass.getDriver().findElement(By.xpath("//h6[text()='Dashboard']")).getText().contains("Dashboard"));
	}

	@When("User provide valid credentials")
	public void user_provide_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Credentials Entered");
		   List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
		   for (Map<String,String> form : signUpForm) {
			   String UserName = form.get("username");
			   System.out.println("USername : " + UserName);
			   HelperClass.getDriver().findElement(By.name("username")).sendKeys(UserName);
			   String PassWord = form.get("password");
			   System.out.println("USername : " + PassWord);
			   HelperClass.getDriver().findElement(By.name("password")).sendKeys(PassWord);
			   
			   HelperClass.getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
			   
		   }
	}

	@Then("USer should be able to  get error message")
	public void u_ser_should_be_able_to_get_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[text()='Invalid credentials']")).getText().contains("Invalid credentials"));
	}
	
	
		
	
	 

}
