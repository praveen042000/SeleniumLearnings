package com.assesment2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass {
	
	LoginPage loginPage;
	
	@Test(priority = 1, dataProvider = "data1", dataProviderClass = Datageter.class)
	public void loginTest(String email, String password) {
		
		loginPage= new LoginPage(driver);
		
		loginPage.LoginAccount(email, password);
		
		loginPage.clickLoginbutton();
		
		Assert.assertTrue(loginPage.getVerifyText().contains("praveen@gamil.com"));
		
		
	}

}
