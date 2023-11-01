package com.seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Smarthospital2 {
	public static void main(String[]args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
     	String url ="https://demo.smart-hospital.in/site/login";
		driver.get(url);

		driver.findElement(By.xpath("(//a[@class='btn btn-primary width50'])[3]")).click();

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

		driver.findElement(By.xpath("//span[text()='Messaging']")).click();

//		driver.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/notification/add']")).click();
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("./screen/h1.png"));
		
		
		//Reusable function
//		public static void calendar(WebDriver driver,WebElement element,string date) {
//			
//		}

//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Logesh");
//
//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Logesh");
//
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='wysihtml5-sandbox']")));
//
//		driver.findElement(By.xpath("//body[@class='form-control wysihtml5-editor']")).sendKeys("Hi how are you");
//
//		driver.switchTo().parentFrame();
//
//		driver.findElement(By.xpath("//input[@id='date']")).sendKeys("11/11/2000");
//
//		driver.findElement(By.xpath("//input[@id='publish_date']")).sendKeys("11/11/2011");
//
//		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
//
//		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText());
	}
	

}
