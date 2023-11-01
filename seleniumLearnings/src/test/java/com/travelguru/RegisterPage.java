package com.travelguru;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath ="(//a[@class='dropdown-toggle'])[3]")
	WebElement myaccount;
	
	@FindBy(xpath ="//a[text()=' SIGNUP ']")
	WebElement signup;
	
	@FindBy(xpath ="//input[@id='fname']")
	WebElement firstname;
	
	@FindBy(xpath ="//input[@id='lname']")
	WebElement lastname;
	@FindBy(xpath ="//input[@id='mobile']")
	WebElement mobile;
	@FindBy(xpath ="//input[@id='emailId']")
	WebElement email;
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	@FindBy(xpath ="//input[@id='cpassword']")
	WebElement confirmpassword;
	@FindBy(xpath ="//button[@id='btn_register']")
	WebElement registerbutton;


public RegisterPage(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
}

public void  Registerclick() {
	Actions action = new Actions(driver);
	action.moveToElement(myaccount).click().perform();
	signup.click();		
}
public void setFirstName(String strFirstName) {
	firstname.sendKeys(strFirstName);
}
//public void setLastName(String strLastName) {
//	lastname.sendKeys(strLastName);
//}
//
//public void setMobile(String strMobile) {
//	mobile.sendKeys(strMobile);
//}
//public void setEmail(String strEmail) {
//	email.sendKeys(strEmail);
//}
//
//public void setPassword(String strPassword) {
//	password.sendKeys(strPassword);
//}
//public void setConfirmPassword(String strConfirmPassword) {
//	confirmpassword.sendKeys(strConfirmPassword);
//}
//
//public void setRegisterButton() {
//	registerbutton.click();;
//}

public void FinalRegister(String strFirstName,String strLastName,String strMobile,String strEmail,String strPassword,String strConfirmPassword) {
	Registerclick();
	
	setFirstName(strFirstName);
//	setLastName(strLastName);
//	setMobile(strMobile);
//	setEmail(strEmail);
//	setPassword(strPassword);
//	setConfirmPassword(strConfirmPassword);
//	setRegisterButton();
}
}