package com.newhrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksStepDefinition {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.out.println("______before exceting----------");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
	    System.out.println("open website");
	    driver.get(url);
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String userName) {
	    System.out.println("Enter the username");
	    driver.findElement(By.name("username")).sendKeys(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		 System.out.println("Enter the password");
		    driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	   System.out.println("click Login");
	   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

	@Then("User should be able to login sucessfully and Home page opens")
	public void user_should_be_able_to_login_sucessfully_and_home_page_opens() {
		String newPageText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
	    System.out.println("click login");
	    Assert.assertTrue(newPageText.equals("Dashboard"));
	}
	    
	    @Then("User should be unable to login")
	    public void user_should_be_unable_to_login() {
	    	String newPageText2 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
			
		    System.out.println("Invalid username and pasword");
		    Assert.assertTrue(newPageText2.equals("Invalid credentials"));
	       
	    }

	    @Then("User should cannot login without values")
	    public void user_should_cannot_login_without_values() {
String newPageText3 = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")).getText();
			
		    System.out.println("Invalid username and pasword");
		    Assert.assertTrue(newPageText3.equals("Required"));
String newPageText4 = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")).getText();
			
		    System.out.println("Invalid username and pasword");
		    Assert.assertTrue(newPageText4.equals("Required"));
	    }
	    
	
	@After
	public void close() {
		driver.quit();
		System.out.println("-------After Excetiong---");
	}
	

}

