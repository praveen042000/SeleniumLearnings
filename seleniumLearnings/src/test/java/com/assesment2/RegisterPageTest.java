package com.assesment2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends Baseclass {
	
	RegisterPage registerPage;
	
	
	@Test(priority = 0,dataProvider = "data", dataProviderClass = Datageter.class)
	public void register(String gender, String firstNAme, String lastNAme, String Email, String Password, String cPassword) {
		
		registerPage= new RegisterPage(driver);
//		registerPage.clickRegisterForm();
	registerPage.RegisterAccount(gender, firstNAme, lastNAme, Email, Password, cPassword);
	registerPage.clickRegisterSubmit();
		
	Assert.assertTrue(registerPage.getVerifyText().contains("The specified email already exists"));
		
		
		
	}

}
