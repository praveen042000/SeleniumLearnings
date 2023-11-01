package com.travelguru;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	RegisterPage registerPage;
	
	
	@Test
	public void TestSignup() {
		
		registerPage =new RegisterPage(driver);
		registerPage.Registerclick();
		
		registerPage.FinalRegister("praveen","kumar","9080109021","praveen11qa@gmail.com","praveen34","praveen34");
		
	}
 
}
