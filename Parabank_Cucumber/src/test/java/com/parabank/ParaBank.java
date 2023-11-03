package com.parabank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaBank {
	DataProperty data = new DataProperty();
	
	RegisterLocationAction objHome = new RegisterLocationAction();
	RegisterDetailsLocatorsAction objLogin = new RegisterDetailsLocatorsAction();

	
	@Given("User is on parabankLogin page")
	public void user_is_on_parabank_login_page() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");
	}

	@When("User clicks the register linl")
	public void user_clicks_the_register_linl() {
		objHome.RegisterClick();
	}

	@When("User enters the firstname,lastname.address,city,state,zipcode,phone,ssn")
	public void user_enters_the_firstname_lastname_address_city_state_zipcode_phone_ssn() {
		objLogin.registerInfo(data.firstname,data.lastname,data.address,data.city,data.state,data.zipcode,data.phone,data.ssn);
	}

	@When("user enters the username password confirm")
	public void user_enters_the_username_password_confirm() {
		 objLogin.registerUser(data.customerusername, data.password, data.confirm);
	}

	@Then("User should click the register button")
	public void user_should_click_the_register_button() {
		objLogin.clickLogin();
	}




}
