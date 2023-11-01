package com.seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectingdropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		String url = "https://cruise.thomascook.in/";
		driver.get(url);
		driver.findElement(By.id("cruisePath")).click();
		Select selectobj =new Select(driver.findElement(By.xpath("//select[@name='city']")));
		selectobj.selectByVisibleText(" Canada");
List<WebElement> li= selectobj.getOptions();
System.out.println(li.size());
		for (WebElement webElement : li) {
			System.out.println(webElement.getText());
		}
		Select selectobj2 =new Select(driver.findElement(By.xpath("//select[@name='sailDate']")));
		selectobj2.selectByVisibleText("May-2024");
		Select selectobj3 =new Select(driver.findElement(By.xpath("//select[@name='duration']")));
		selectobj3.selectByVisibleText("1 To 3 night(s)");
		Select selectobj4 =new Select(driver.findElement(By.xpath("//select[@name='cruise']")));
		selectobj4.selectByVisibleText("Select Cruise Line");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='modify search']")));
//		action.moveToElement(driver.findElement(By.xpath("//span[text()='modify search']"))).click().build().perform();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//span[@class='text']")).click();
		Thread.sleep(5000);
		Select selectobj5 =new Select(driver.findElement(By.xpath("//select[@class='custom-select ng-untouched ng-pristine ng-invalid']")));
		selectobj5.selectByVisibleText(" Australia");
		Select selectobj6 =new Select(driver.findElement(By.id("hotelsCheckIn")));
		selectobj6.selectByVisibleText("Jun-2024");
		driver.findElement(By.xpath("//button[@class='search_btn']")).click();
		driver.findElement(By.xpath("(//a[@class='booknow'])[1]")).click();
		driver.close();

}
}