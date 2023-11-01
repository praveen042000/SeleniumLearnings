package com.seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bstackdemoselect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		String url = "https://bstackdemo.com/";
		driver.get(url);
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> options =driver.findElements(By.xpath("//main//select//option"));
		System.out.println(options.size());
		String s="Lowest to highest";
		for (WebElement webElement : options) {
			if(webElement.getText().equals(s)) {
				webElement.click();
			}
			
		}
		driver.findElement(By.xpath("(//main//select//option)[3]")).click();
		
		WebElement option2 = driver.findElement(By.xpath("//select"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].value='lowestprice'",option2);
		
		WebElement ele = driver.findElement(By.xpath("//select"));
		WebElement customOption =driver.findElement(By.xpath("//option[text()='Lowest to highest"));
		customOption.click();
 	}


}
//select/option[contains(text(),"option2+"')]"));"