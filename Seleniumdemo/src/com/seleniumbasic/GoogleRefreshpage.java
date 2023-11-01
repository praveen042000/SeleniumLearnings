package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRefreshpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = "https://www.google.com/";
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.querySelector('div.a4bIc').value='selenium'");
//		jse.executeScript("history.go(0)");
//		jse.executeScript("window.location='https://www.lambdatest.com/'");
//		jse.executeScript("window.location='https://www.lamdatest.com'");
//		Thread.sleep(5000);
//		
//		jse.executeScript("window.scrollBy(0,500)");
		
//		String titleText =jse.executeScript("return document.title").toString();
//		System.out.println(titleText);
		
//		String URL =jse.executeScript("return document.URL").toString();
//		System.out.println(URL);
		
//		jse.executeScript("Window.scrollBy(0,document.body.ScrollHeight)");
		
//		String innerText =jse.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(innerText);
		changelocation(driver);
Title(driver);
URL(driver);
Innertext(driver);
	}
	
	public static void changelocation(WebDriver location) {
		JavascriptExecutor jse = (JavascriptExecutor)location;
		String changelocation = jse.executeScript("window.location='https://www.lambdatest.com/'").toString();
		System.out.println(changelocation);
	}
	public static void Title(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String titleText = jse.executeScript("return document.title;").toString();
		System.out.println(titleText);

	}
	public static void URL(WebDriver url) {
		JavascriptExecutor jse = (JavascriptExecutor)url;
		String URL =jse.executeScript("return document.URL").toString();
		System.out.println(URL);
		
	}
	public static void Innertext(WebDriver inner) {
		JavascriptExecutor jse = (JavascriptExecutor)inner;
		String Innertext =jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(Innertext);
		
	}
}
