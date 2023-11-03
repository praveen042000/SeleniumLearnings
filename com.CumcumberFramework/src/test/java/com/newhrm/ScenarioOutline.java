package com.newhrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	
WebDriver driver;
	
	@Before
	public void setup() {
		System.out.println("______before exceting----------");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
	}
	@Given("use the url {string}")
	public void use_the_url(String url) {
		 System.out.println("open website");
		    driver.get(url);
	}

	@When("User enters in  username as {string}")
	public void user_enters_in_username_as(String userName) {
		 System.out.println("Enter the username");
		    driver.findElement(By.name("username")).sendKeys(userName);
	}

	@When("User enters  in password as {string}")
	public void user_enters_in_password_as(String password) {
		System.out.println("Enter the password");
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		System.out.println("click Login");
		   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

	@Then("User should be able to login unsucessfully with error messsage")
	public void user_should_be_able_to_login_unsucessfully_with_error_messsage() {
		String newPageText2 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		
	    System.out.println("Invalid username and pasword");
	    Assert.assertTrue(newPageText2.equals("Invalid credentials"));
	}




}
