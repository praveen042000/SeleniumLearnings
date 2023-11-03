package com.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterDetailsLocators {
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	public WebElement lastname;
	@FindBy(xpath="//input[@id='customer.address.street']")
	public WebElement address;
	@FindBy(xpath="//input[@id='customer.address.city']")
	public WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']")
	public WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement zipcode;
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public WebElement phone;
	@FindBy(xpath="//input[@id='customer.ssn']")
	public WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']")
	public WebElement customerusername;
	@FindBy(xpath="//input[@id='customer.password']")
	public WebElement password;
	@FindBy(xpath="//input[@id='repeatedPassword']")
	public WebElement confirm;
	@FindBy(xpath="(//input[@class='button'])[2]")
	public WebElement registebutton;
	
	@FindBy(xpath="//p[text()='Your account was created successfully. You are now logged in.']")
	public WebElement  verfiyText;

}
