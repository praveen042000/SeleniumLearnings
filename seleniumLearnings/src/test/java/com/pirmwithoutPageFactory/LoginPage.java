package com.pirmwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	By titleText = By.xpath("//h5[text()='Login']");
	By login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
// set user name in textbox
	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
	}
	
	//set user password in textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public String getLoginTitle() {
		 return  driver.findElement(titleText).getText();
	}
	public void login(String strUserName,String strPassword) {
		// Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPassword);
		
		//click the login button
		
		this.clickLogin();
	}
}
