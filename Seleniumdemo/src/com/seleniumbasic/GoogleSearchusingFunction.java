package com.seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GoogleSearchusingFunction {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = "https://www.google.com/";
		driver.get(url);
		xpathClick(driver,"(//input[@class='RNmpXc'])[2]");
	}
	
	
	public static void xpathClick(WebDriver driver,String string) throws IOException {
		click(driver,driver.findElement(By.xpath(""+string+"")));
	}
	public static void click(WebDriver driver,WebElement Element) throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", Element);
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("./screen/h1.png"));
	}
}
