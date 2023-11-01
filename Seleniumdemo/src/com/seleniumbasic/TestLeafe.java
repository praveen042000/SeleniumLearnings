package com.seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafe {
	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//		String url = "https://leafground.com/frame.xhtml;jsessionid=node038wykfgt2dxz6uh99nq4t2jv538552.node0";
//		driver.get(url);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.cssSelector("[style='color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%']")).click();
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
//		driver.switchTo().frame(frame2);
//		driver.findElement(By.cssSelector("[style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']")).click();
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url="https://leafground.com/frame.xhtml;jsessionid=node038wykfgt2dxz6uh99nq4t2jv538552.node0";

		driver.get(url);

		List<WebElement> element= driver.findElements(By.tagName("iframe"));

		System.out.println(element.size());

		driver.switchTo().frame(0);

		List<WebElement> element1= driver.findElements(By.tagName("button"));

		System.out.println(driver.findElement(By.tagName("button")).getAttribute("id"));

		System.out.println(element1.size());

		driver.findElement(By.cssSelector("[style='color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%']")).click();
		
		
		
	}

}