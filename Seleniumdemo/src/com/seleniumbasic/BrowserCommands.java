package com.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		String url = ("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.get(url);	
		String title = driver.getTitle();
		String currentURL =driver.getCurrentUrl();
		String pageSource =driver.getPageSource();
		int pagelength =title.length();
		Class<? extends WebDriver> className = driver.getClass();
		
		System.out.println("The page Title is :" + title);
		System.out.println("The page currentURL is :" + currentURL);
//		System.out.println("The page pageSource is :" + pageSource);
		System.out.println("The page className is :" + className);
		System.out.println("The page length is :" + pagelength);
if(url.equalsIgnoreCase(currentURL)) {
			System.out.println("correct page opened"); 
		}else
		{
			System.out.println("Incorrect page opened");
		}
		driver.close();
		}

}
