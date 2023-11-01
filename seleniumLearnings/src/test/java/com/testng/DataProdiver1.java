package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DataProdiver1 {
	public WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	By loginTitle =By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	By errormsg = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	@BeforeMethod
	@Parameters("browser")
	public void parameterizedTest(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver=new ChromeDriver(options);
			System.out.println("Browserr started :"+ browser);
		}
		else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--start-maximized");
			driver=new EdgeDriver(options);
			System.out.println("Browserr started :"+ browser);
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	@Parameters({ "user","pass"})
	public void validCredentials(String user,String pass) {
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
		System.out.println("Acutal Title :" + driver.findElement(loginTitle).getText());

		Assert.assertEquals((driver.findElement(loginTitle)).getText(), "Dashboard");
		
	}
	@Test
	@Parameters({ "val1","val2"})

	public void InvalidCredentials(String val1,String val2) {

		driver.findElement(userName).sendKeys(val1);

		driver.findElement(password).sendKeys(val2);

		driver.findElement(loginBtn).click();

		System.out.println("Acutal ErrorMessage :" + driver.findElement(errormsg).getText());

		Assert.assertEquals((driver.findElement(errormsg)).getText(), "Invalid credentials");

	}

}
