
Feature: Login Functionality of HRM Web Application


  Scenario: Verification of Login using valid credentials
  
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com"
		When User enters username as "admin"
	  And User enters password as "admin123"
		And User clicks login button
  	Then User should be able to login sucessfully and Home page opens