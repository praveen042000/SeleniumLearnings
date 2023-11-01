package com.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J2Store {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String url = "http://j2store.net/free/index.php/blog";
		driver.get(url);
		driver.findElement(By.xpath("(//a[@class=' dropdown-toggle'])[2]")).click();

	}

}
