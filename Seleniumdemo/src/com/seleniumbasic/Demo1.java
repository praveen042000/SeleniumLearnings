package com.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pmanoharan1\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\pmanoharan1\\Selenium\\edgedriver_arm64\\msedgedriver.exe");
//	System.setProperty("webdriver.firefox.driver","C:\\Users\\pmanoharan1\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//	ChromeOptions option = new ChromeOptions();
	
	WebDriver driver = new ChromeDriver();
	
//	FirefoxOptions options=new FirefoxOptions();
//	options.addArguments("--headless");
	
//	EdgeOptions options = new EdgeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	options.addArguments("--headless");
//	WebDriver driver = new FirefoxDriver(options);

//	WebDriver driver = new EdgeDriver(options);
	driver.get("https://www.selenium.dev/downloads/");
//	String title = driver.getTitle();
//	System.out.println("The title is :" + title);
	
	
//	driver.close();
}

}
