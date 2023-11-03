package com.parabank;

import org.openqa.selenium.support.PageFactory;


public class RegisterDetailsLocatorsAction {
	RegisterDetailsLocators registerDetailsLocators = null;
	String strUserName, strPassword;
	
	public RegisterDetailsLocatorsAction() {
		this.registerDetailsLocators = new RegisterDetailsLocators();
		PageFactory.initElements(HelperClass.getDriver(),registerDetailsLocators);
	}
	public void setFirstName(String strFirstName) {
		registerDetailsLocators.firstname.sendKeys(strFirstName);
	}
	public void setLastName(String strLastName) {
		registerDetailsLocators.lastname.sendKeys(strLastName);
	}
	
	public void setAddress(String strAddress) {
		registerDetailsLocators.address.sendKeys(strAddress);
	}
	public void setCity(String strCity) {
		registerDetailsLocators.city.sendKeys(strCity);
	}
	
	public void setState(String strState) {
		registerDetailsLocators.state.sendKeys(strState);
	}
	public void setZipcode(String strZipcode) {
		registerDetailsLocators.zipcode.sendKeys(strZipcode);
	}
	public void setPhone(String strPhone) {
		registerDetailsLocators.phone.sendKeys(strPhone);
	}
	
	public void setSsn(String strSsn) {
		registerDetailsLocators.ssn.sendKeys(strSsn);
	}
	public void setCustomeruserName(String strCustomeruserName) {
		registerDetailsLocators.customerusername.sendKeys(strCustomeruserName);
	}
	
	public void setPassword(String strPassword) {
		registerDetailsLocators.password.sendKeys(strPassword);
	}
	
	public void setConfirm(String strConfirm) {
		registerDetailsLocators.confirm.sendKeys(strConfirm);
	}
	public void clickLogin() {
		registerDetailsLocators.registebutton.click();
		
	}
	public String getVerifyText() {
		return registerDetailsLocators.verfiyText.getText();
	}
	
	public void registerInfo(String firstname,String lastname,String address,String city, String state, String zipcode, String phone, String ssn ) {
		setFirstName(firstname);
		setLastName(lastname);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
		setPhone(phone);
		setSsn(ssn);
	}
	public void registerUser(String customerusername, String password, String confirm) {
		setCustomeruserName(customerusername);
		setPassword(password);
		setConfirm(confirm);
	}

}
