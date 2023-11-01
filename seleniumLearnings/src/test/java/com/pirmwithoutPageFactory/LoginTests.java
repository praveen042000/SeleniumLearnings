package com.pirmwithoutPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
	LoginPage objLogin;
	@Test(priority = 0)
	public void loginTest() {
		objLogin = new LoginPage(driver);
		
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Login"));
	}

}
