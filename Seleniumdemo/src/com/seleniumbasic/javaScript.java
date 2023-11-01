package com.seleniumbasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javaScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		String url = "https://www.google.com/";
		driver.get(url);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("alert('Arun')");
		jse.executeScript("prompt()");

	}

}
