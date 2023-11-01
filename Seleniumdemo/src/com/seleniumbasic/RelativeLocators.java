package com.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.zoho.com/signup.html");

		WebElement email = driver.findElement(By.cssSelector("#email"));

		email.sendKeys("Praveen");

		WebElement password =driver.findElement(with(By.tagName("input")).below(email));

		password.sendKeys("Praveen@16");
		
		WebElement phoneno =driver.findElement(with(By.tagName("input")).below(password));
		phoneno.sendKeys("9080109022");
		
//		WebElement agree =driver.findElement(with(By.cssSelector("#signup-termservice")).below(phoneno));
//		agree.click();
		
//		WebElement signup =driver.findElement(with(By.tagName("input")).below(agree));
//		signup.click();
		
		WebElement linked = driver.findElement(with (By.className("vi-linkedin")));

//		linked.click();
		WebElement google =driver.findElement(with(By.tagName("span")).toLeftOf(linked));
//		google.click();
		WebElement microsoft =driver.findElement(with(By.tagName("span")).near(linked));
		microsoft.click();
		
		
		
	}

}
//WebElement password =driver.findElement(with(By.tagName("input")).below(path));