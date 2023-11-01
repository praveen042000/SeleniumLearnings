package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_ById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.leafground.com/input.xhtml");
//		driver.get("https://www.leafground.com/select.xhtml");
//		driver.get("https://www.leafground.com/link.xhtml");
		driver.get("https://www.makemytrip.com/flights/");
		
//		WebElement Element =driver.findElement(By.id("j_idt88:name"));
//		Element.sendKeys("Praveen");
//		
//		WebElement Element1=driver.findElement(By.name("j_idt88:j_idt91"));
//
//		Element1.sendKeys("India");
		
//		WebElement Element2=driver.findElement(By.className("ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled"));
//		boolean is = Element2.isEnabled();
//		System.out.println(is);
//		Element2.sendKeys("Welcome to my code world");
				
//		WebElement Element3 =driver.findElement(By.tagName("select"));
//		Element3.click();
//		System.out.println(Element3.getText());
//		Element3.sendKeys("Selenium");
//		Element3.click();
//		WebElement Element3 =driver.findElement(By.linkText("Go to Dashboard"));
//		Element3.click();
//		
//		WebElement Element3 =driver.findElement(By.partialLinkText("Go to "));
//		Element3.click();
		
		List<WebElement> Element4 =driver.findElements(By.tagName("a"));
		System.out.println(Element4.size());
		for (WebElement webElement : Element4) {
			System.out.println(webElement.getText());
			
		}
//		driver.close();

	}

}















