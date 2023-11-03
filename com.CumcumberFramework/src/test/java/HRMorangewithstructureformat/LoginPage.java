package HRMorangewithstructureformat;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	DataProperties data = new DataProperties();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");	
	}

	@When("User enters to username and password")
	public void user_enters_to_username_and_password() {
		objLogin.loginInfo(data.username, data.password);
		   System.out.println("Username and password");
	}

	@When("User clicks to login button")
	public void user_clicks_to_login_button() {
		objLogin.clickLogin();
		   System.out.println("login button");
	}

	@Then("User should be able to login sucessfully and Home page opens verified")
	public void user_should_be_able_to_login_sucessfully_and_home_page_opens_verified() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		   System.out.println("sucessfull login");
	}




}
