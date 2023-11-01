package com.pirmwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By homePageText =By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	public HomePage(WebDriver driver) {
		this.driver= driver;
		
	}
	public String getTitle(){
		return driver.findElement(homePageText).getText();
	}

}
