package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMehod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://leafground.com/waits.xhtml;jsessionid=node0siht9m7da2ak1ljrkb21tvrbb532241.node0");
		WebElement btn = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		btn.click();
		WebElement click = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']"));
		System.out.println(click.getText());
		click.click();
		
		

	}

}
