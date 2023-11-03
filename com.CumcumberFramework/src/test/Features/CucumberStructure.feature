Feature: Login to HRM Application


Scenario: Login  with the valid credentials

	Given User is on HRMLogin page 
	When User enters to username and password
	And User clicks to login button
	Then User should be able to login sucessfully and Home page opens verified