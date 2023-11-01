package com.seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertdemo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		String url = "https://leafground.com/alert.xhtml;jsessionid=node015atqmskdpr9n10q66jcjwx5m8541022.node0";
		driver.get(url);
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
//		String alertMessage =driver.switchTo().alert().getText();
//		System.out.println(alertMessage);
//	Thread.sleep(5000);
//	alert.accept();
//	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
//	Alert alert = driver.switchTo().alert();
//	String alertMessage =driver.switchTo().alert().getText();
//	System.out.println(alertMessage);
//	alert.accept();
	
//	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
//	Alert alert = driver.switchTo().alert();
//	alert.dismiss();
	
	driver.findElement(By.id("j_idt88:j_idt104")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Praveen");
	alert.accept();
}
}
