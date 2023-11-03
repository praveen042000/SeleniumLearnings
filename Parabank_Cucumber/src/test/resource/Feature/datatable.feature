Feature: Login to HRM WebApplication
 
	@ValidCredentials
	
	Scenario: Login with valid credentials
	
		Given User is on HRMLogin Webpage
		When User provides valid credentials
						|Username|password|
						|Admin   |admin123|
		Then USer should be able to login successfully and see homepage
		
		@InvalidCredentials
	Scenario: Login with Invalid credentials
	
		Given User is on HRMLogin Webpage
		When User provide valid credentials
						|Username|password|
						|Admin1  |admin123|
						|Admin2  |admin123|
		Then USer should be able to  get error message