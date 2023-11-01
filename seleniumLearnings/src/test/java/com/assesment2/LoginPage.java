package com.assesment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement logInPage;
	
	@FindBy(id="Email")
	WebElement eMail;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginbut;
	
	@FindBy(xpath="//a[text()='praveen@gamil.com']")
	WebElement verifyText;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	public void clickLogin() {
		logInPage.click();
	}
	public void setEmail(String email) {
		eMail.sendKeys(email);
	}
	
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickLoginbutton() {
		loginbut.click();
	}
	public String getVerifyText()
	{
		return verifyText.getText();
	}
	public void LoginAccount(String email , String password) {
		clickLogin();
		setEmail(email);
		setPassword(password);
		
	}
}
