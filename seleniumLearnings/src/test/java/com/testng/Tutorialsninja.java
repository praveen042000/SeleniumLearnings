package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Tutorialsninja {
	public WebDriver driver;
	
	
  @Test(priority=0 , groups = {"demo"})
  public void register() {
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@title='My Account']"))).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//a[text()='Register']"))).click().build().perform();
	  
	  Assert.assertEquals("Register Account", driver.getTitle());
	  
	  driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Praveen",Keys.TAB,"Manoharan",Keys.TAB,"praveen7@gmail.com",Keys.TAB,"9090109022",Keys.TAB,"praveen@2000",Keys.TAB,"praveen@2000");
	  driver.findElement(By.xpath("//input[@name='agree']")).click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
//	  driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	  
	  
  }
  
  @Test(priority=1,dependsOnGroups="demo" )
  public void login() {
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@title='My Account']"))).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("(//a[text()='Login'])[1]"))).click().build().perform();
	  Assert.assertEquals("Account Login", driver.getTitle());
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("document.getElementById('input-email').value='praveen7@gmail.com'");
	  jse.executeScript("document.getElementById('input-password').value='praveen@2000'");
	  jse.executeScript("document.getElementsByClassName('btn btn-primary')[1].click();");
  }  
  
  @Test(priority=2,dependsOnMethods="login" )
  public void searchParticular() {
//	  JavascriptExecutor jse = (JavascriptExecutor)driver;
//	  jse.executeScript("document.getElementsByClassName('form-control input-lg').value='iphone'");
	  driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("iphone",Keys.ENTER);
	  driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
	  Assert.assertEquals("Search - iphone", driver.getTitle());
	  
  }
  
  @Test(priority=3,groups = {"demo"})
  public void removeitem() {
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]"))).click().build().perform();
	 driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
	 Assert.assertEquals("My Wish List", driver.getTitle());
//	 Assert.assertSame("ChromeDriver",driver);
//	  System.out.println("same driver");

	  
  }
  
  @BeforeTest(groups = {"demo"})
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();
	  driver =new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void afterTest() {
  }

}
