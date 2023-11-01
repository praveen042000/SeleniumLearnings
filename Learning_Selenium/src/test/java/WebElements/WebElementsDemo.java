package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		String title = driver.getTitle();
		System.out.println("urlname" + driver.getCurrentUrl());
	
WebElement phoneNo = driver.findElement(By.xpath("//input[@class= '_18u87m _3WuvDp']"));
phoneNo.sendKeys("9080109022");
//phoneNo.clear();
WebElement otp= driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']"));
String otp1 =otp.getText(); 
String color =otp.getCssValue("color");
String id =otp.getAttribute("Name");
otp.click();
boolean select = otp.isSelected();
boolean enable = otp.isEnabled();
boolean display = otp.isDisplayed();

Dimension d=otp.getSize();
Point p=otp.getLocation();

System.out.println(select);
System.out.println(enable);
System.out.println(display);
System.out.println("The visible text is:" + otp1);
System.out.println(title);
System.out.println(d);
System.out.println("web tagname"+otp.getTagName());
System.out.println("attribute"+ id);
System.out.println(color);
	}

}
