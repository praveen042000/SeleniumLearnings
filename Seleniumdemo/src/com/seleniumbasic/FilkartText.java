package com.seleniumbasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilkartText {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("iphone15",Keys.ENTER);
		String parentWindow = driver.getWindowHandle();
		System.out.println("The parent window id is:"+ parentWindow);
		Set<String>l  =driver.getWindowHandles();
//		System.out.println(l.size());
		for (String string : l) {
			System.out.println(l.size());
			
		}
		driver.close();
		
//		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).click();
}
}
