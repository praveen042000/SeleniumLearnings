package com.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutHrmpage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		String currentURL =driver.getCurrentUrl();
		System.out.println(currentURL);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");


//		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
//		user.sendKeys("Admin");
		WebElement passw = driver.findElement(By.xpath("//input[@name='password']"));
		passw.sendKeys("admin123");
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"))).click();
		
		
//		WebElement myinfo = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
//		myinfo.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))).sendKeys("admin");
//		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
	}

}
