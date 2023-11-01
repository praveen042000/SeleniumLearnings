package com.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orcale {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String url = "https://docs.oracle.com/javase/8/docs/api/";
		driver.get(url);
		WebElement frame = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='Description']")).click();
	}

}
