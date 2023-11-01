package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProdiver {
	WebDriver driver;
	
	@DataProvider(name="testData")
	public Object[][] dataprovFunc(){
		return new Object[][] {{"java"},{"Testing"}};
	}
	@BeforeMethod
	public void setup() {
		System.out.println("Start the test");
		driver =new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="testData")

	public void search(String Keyword) throws InterruptedException {

		driver.findElement(By.id("sb_form_q")).sendKeys(Keyword,Keys.ENTER);
     Thread.sleep(5000);
		System.out.println("Search result is displayed");

	}
	

}
