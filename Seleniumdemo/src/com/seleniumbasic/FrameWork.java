package com.seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url="https://the-internet.herokuapp.com/nested_frames";

		driver.get(url);

		List<WebElement> e1 = driver.findElements(By.tagName("frame"));

		System.out.println(e1.size());

		driver.switchTo().frame(0);

		List<WebElement> e = driver.findElements(By.tagName("frame"));

		System.out.println(e.size());

		driver.switchTo().frame(0);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().parentFrame();

		driver.switchTo().frame(1);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().parentFrame();

		driver.switchTo().frame(2);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();
	}

}

