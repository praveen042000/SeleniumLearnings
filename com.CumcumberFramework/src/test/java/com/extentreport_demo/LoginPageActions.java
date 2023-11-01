package com.extentreport_demo;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocators loginPageLocators = null;
	String strUserName, strPassword;
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginPageLocators.login.click();
		
	}
	public String getVerifyText() {
		return loginPageLocators.verifyText.getText();
	}
	
public void loginInfo(String userName,String password) {
	setUserName(userName);
	setPassword(password);
}
}
