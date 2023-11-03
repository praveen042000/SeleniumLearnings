
Feature: Login Functionality of HRM Web Application

Background:
   Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com"
@ValidCredentials
  Scenario: Verification of Login using valid credentials
  
 
		When User enters username as "Admin"
	  And User enters password as "admin123"
		And User clicks login button
  	Then User should be able to login sucessfully and Home page opens
  	
  	@InValidCredentials
  Scenario:  Login using invalid credentials
  
   
		When User enters username as "username"
	  And User enters password as "password"
		And User clicks login button
  	Then User should be unable to login
  	
  		@InValidCredentials @BlankCredentials
  Scenario:  Login with Blank credentials
  
 
		When User enters username as " "
	  And User enters password as " "
		And User clicks login button
  	Then User should cannot login without values 