package com.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
    public static void main(String[] args) {
        // Create a new instance of the ChromeDriver and maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://www.saucedemo.com/v1/");

        // Find the search input field and store it in a WebElement
        WebElement search = driver.findElement(By.xpath("//input[@id='user-name']"));
        search.sendKeys("standard_user");
        
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
