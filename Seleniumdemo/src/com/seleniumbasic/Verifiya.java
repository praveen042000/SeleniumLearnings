package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifiya {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://verifalia.com/validate-email");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input-lg form-control w-100 ng-pristine ng-invalid ng-touched']"))).sendKeys("praveen11");
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='inputData']")));

	driver.findElement(By.xpath("//input[@name='inputData']")).sendKeys("Admin");

	WebDriverWait wait3 =new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']")).click();

	
//	driver.findElement(By.xpath("//input[@class='input-lg form-control w-100 ng-pristine ng-invalid ng-touched']")).sendKeys("praveen11");
}
}
