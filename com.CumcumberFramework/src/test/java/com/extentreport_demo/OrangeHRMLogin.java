//package com.extentreport_demo;
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class OrangeHRMLogin {
//	LoginPageActions objLogin = new LoginPageActions();
//
//	@Given("User is on HRMLogin page {string}")
//	public void user_is_on_hrm_login_page(String url) {
//	   HelperClass.openPage(url);
//	}
//
//	@When("User enters username and password")
//	public void user_enters_username_and_password() {
//		objLogin.loginInfo("Admin","admin123");
//	   
//	}
//
//	@When("User clicks login button")
//	public void user_clicks_login_button() {
//		objLogin.clickLogin();
//	  System.out.println("loginbutton");
//	}
//
//	@Then("User should be able to login sucessfully and Home page opens")
//	public void user_should_be_able_to_login_sucessfully_and_home_page_opens() {
//		Assert.assertTrue(objLogin.getVerifyText().contains("Dashboard"));
//	   System.out.println("sucessfully runned");
//	}
//
//
//}
