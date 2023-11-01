package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = "https://www.redbus.in/";
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('src').value='coimbatore'");
		jse.executeScript("document.getElementById('dest').value='chennai'");
		jse.executeScript("history.go(0)");

}
}
