package com.seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://guide.blazemeter.com/hc/en-ushttps://guide.blazemeter.com/hc/en-us");
		List<WebElement> Elements =driver.findElements(By.cssSelector("ul#categories>li:nth-of-type(n)"));
//		WebElement path =driver.findElements(By.cssSelector("ul#categories>li:nth-of-type(n)"));
		System.out.println(Elements.size());
//		for (WebElement webElement : Element4) {
//			System.out.println(webElement.getText());
//			if(((WebElement) Element4).getText().equals("BlazeMeter API"));
//			((WebElement) Element4).click();
//			
//		}
//		if(Element4.getText().equals("BlazeMeter API"));
//		Element4.click();
	
for (WebElement element : Elements) {
System.out.println(element.getText());
if (element.getText().equals("BlazeMeter API")) {
element.click();
 break; 
}
}
	}
}


