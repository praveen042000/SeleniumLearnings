package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			if
			(driver.getTitle().equalsIgnoreCase("Google"))
			System.out.println("correct title");
			else
		  System.out.println("Incorrect title");
			
			WebElement google = driver.findElement(By.name("q"));
			boolean is =google.isEnabled();
			System.out.println(is);
			google.sendKeys("Selenium");
			
			WebElement googlesearch =driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
			boolean iss = googlesearch.isEnabled();
			System.out.println(iss);
			Thread.sleep(1000);
			googlesearch.click();
			
		}

}
