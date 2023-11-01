package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LifeWire {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com//iframe";
		driver.get(url);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame);
//		driver.switchTo().frame(0);
			driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
			driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Praveen");
			driver.switchTo().parentFrame();
			
	}

}
