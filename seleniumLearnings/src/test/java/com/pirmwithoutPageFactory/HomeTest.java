package com.pirmwithoutPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	LoginPage objLogin;
	HomePage objHomePage;
	
	@Test(priority = 1)
	public void DashboardTest() {
		objLogin = new LoginPage(driver);
		
		//Login to application
		objLogin.login("Admin","admin123");
		//go the dashboard page
		objHomePage = new HomePage(driver);
		
		//Verify dashboard page
		Assert.assertTrue(objHomePage.getTitle().contains("Dashboard"));
	}

}
