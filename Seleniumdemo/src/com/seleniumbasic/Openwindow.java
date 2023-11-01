package com.seleniumbasic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openwindow {
	public static void main(String[] args){
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://leafground.com/window.xhtml");
////		driver.switchTo().newWindow(WindowType.TAB);
//		WebElement clickme = driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
//		clickme.click();
//		String l=driver.getWindowHandle();
//		Set<String>AllWindow  =driver.getWindowHandles();
//		for (String string : AllWindow) {
//			driver.switchTo().window(string);
//			
//		}
//		System.out.println("page Title:"+ driver.getTitle());
//		driver.close();
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://leafground.com/window.xhtml");
//
//		WebElement clickme = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
//		clickme.click();
//		String l=driver.getWindowHandle();
//		Set<String>l1  =driver.getWindowHandles();
//		for (String string : l1) {
//			
//			
//		}
//		System.out.println(l1.size());
//		driver.close();
		
		
//		WebDriver driver = new ChromeDriver();	
//	driver.manage().window().maximize();
//		String url = "https://leafground.com/window.xhtml";
//	driver.get(url);
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
//	String s = driver.getWindowHandle();
//	Set<String> s1 =driver.getWindowHandles();
//		for (String string : s1) {
//			driver.switchTo().window(string);
//			if(driver.getTitle().equals("Window"));
//			else driver.close();
//
//		}
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();

		String url = "https://leafground.com/window.xhtml";

		driver.get(url);
		System.out.println(driver.getTitle());

		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='j_idt88:j_idt95']")));

		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']")).click();

		String s = driver.getWindowHandle();

		Set<String> s1 =driver.getWindowHandles();

		for (String string : s1) {

			driver.switchTo().window(string);

			if(driver.getTitle().equals("Window"));

			else driver.close();

		}
		
}
	
	
}
