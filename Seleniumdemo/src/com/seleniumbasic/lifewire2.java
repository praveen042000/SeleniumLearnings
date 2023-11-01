package com.seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class lifewire2 {
	public static void main(String[] args) {

//		WebDriver driver = new EdgeDriver();	
//		
//		driver.manage().window().maximize();
//		String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
//		driver.get(url);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//select[@id='first']"))).click();
//		action.moveToElement(driver.findElement(By.xpath("//option[@value='Google']"))).click();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		String url ="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";

		driver.get(url);
//		WebElement selectobj = driver.findElement(By.xpath("//select[@id='first']"));
//		Select dropdown = new Select(selectobj);
//		List<WebElement> list = dropdown.getOptions();
//		
//		System.out.println(list.size());
//		for (WebElement webElement : list) {
//			System.out.println("GetText"+ webElement.getText());
//		}
		
//		Select selectobj =new Select(driver.findElement(By.xpath("//select[@id='first']")));
//		selectobj.selectByVisibleText("Yahoo");
//		selectobj.selectByVisibleText("Iphone");
//		selectobj.selectByIndex(3);
//		selectobj.deselectByIndex(3);

		Select selectobj =new Select(driver.findElement(By.xpath("//select[@id='second']")));
		System.out.println(selectobj.isMultiple());
		selectobj.selectByIndex(1);
		selectobj.selectByIndex(2);
//		selectobj.deselectByIndex(2);
		selectobj.deselectAll();

//		Actions action = new Actions(driver);
//
//		action.moveToElement(driver.findElement(By.xpath("//select[@id='first']"))).click().build().perform();
//
//		driver.findElement(By.xpath("//select[@id='first']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
}
}