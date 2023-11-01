package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;

public class Demo1 {
	public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();
//	  EdgeOptions options =new EdgeOptions();
//	   driver =new EdgeDriver(options);
	  driver =new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://www.amazon.in/");
  }
  @Test
  public void validation() {
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hard disk",Keys.ENTER);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
