package com.pomwithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name ="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement titleText;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement LoginPage;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
// set user name in textbox
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
	
	//set user password in textbox
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	public void clickLogin() {
		LoginPage.click();
	}
	
	public String getLoginTitle() {
		return titleText.getText();
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
