package com.seleniumbasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchJs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		String url = "https://www.google.com/";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("document.getById('')");
		driver.get(url);
		js.executeScript("document.getElementByName('q')[0].value='selenium';");
		
	}

}
