package com.extentreport_demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(name ="username")
	public WebElement userName;
	
	@FindBy(name ="password")
	public WebElement password;
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login;
	@FindBy
	(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement verifyText;


}
