package com.extentreport_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	
	File file = new File("");
	FileInputStream fileInpur = null;
	try {
		fileInput = new FileInputStream(file);}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop  = new properies();
		try {
			prop.load(fileInput);
		}catch (IOException e)
		e.printStackTrace();
	}
	setUserName(userName);
	setPassword(password);
}
}
