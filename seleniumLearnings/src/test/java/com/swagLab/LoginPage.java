package com.swagLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPage {
 
		WebDriver driver;
		
		@FindBy(name="user-name")
		WebElement userName;
		@FindBy(name="password")
		WebElement passWord;
		@FindBy(xpath="//input[@class='btn_action']")
		WebElement login;
		@FindBy(xpath="//div[text()='Products']")
		WebElement verifyText;
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		public void setUsername(String user) {
			userName.sendKeys(user);
		}
		public void setPassword(String pass) {
			passWord.sendKeys(pass);
		}
		public void clickLogin() {
			login.click();
		}
		public String getverifyText() {
			return verifyText.getText();
		}
		public void loginAccount(String user, String pass) {
			setUsername(user);
			setPassword(pass);
			clickLogin();
		}
}