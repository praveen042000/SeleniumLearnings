package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHrm {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		String currentURL =driver.getCurrentUrl();
		System.out.println(currentURL);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		WebElement passw = driver.findElement(By.xpath("//input[@name='password']"));
		passw.sendKeys("admin123");
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		WebElement myinfo = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]"));
		myinfo.click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
		if(url.equals(currentURL)) {
			System.out.println("correct page opened"); 
		}else
		{
			System.out.println("Incorrect page opened");
		}
		driver.close();
		}

}
