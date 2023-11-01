package com.assesment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderMale;
	
	@FindBy(id="gender-female")
	WebElement genderFeMale;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement eMail;
	
	@FindBy(id="Password")
	WebElement passWord;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassWord;
	
	@FindBy(id="register-button")
	WebElement registerClick;

	@FindBy(xpath="//li[text()='The specified email already exists']")
	WebElement verifyText;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterForm() {
		register.click();
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("female")) {
			genderFeMale.click();
		}else {
			genderMale.click();
		}
	}
	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	public void setLastName(String LastName) {
		lastName.sendKeys(LastName);
	}
	public void setEmail(String Email) {
		eMail.sendKeys(Email);
	}
	public void setPassWord(String password) {
		passWord.sendKeys(password);
	}
	
	public void setCpassWord(String cPassword) {
		confirmPassWord.sendKeys(cPassword);
	}
	
	public void clickRegisterSubmit() {
		registerClick.click();
	}
	public String getVerifyText() {
		return verifyText.getText();
	}
	public void RegisterAccount(String gender, String fistrname,String lastname,String email,String password,String cpassword) {
		clickRegisterForm();
		setGender(gender);
		setFirstName(fistrname);
		setLastName(lastname);
		setEmail(email);
		setPassWord(password);
		setCpassWord(cpassword);
	}
}