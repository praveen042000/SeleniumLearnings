Feature: Login to Parabank Application


Scenario: Login  with the valid createdials in parabank

	Given User is on parabankLogin page 
	When User clicks the register linl
	And User enters the firstname,lastname.address,city,state,zipcode,phone,ssn
	And user enters the username password confirm
	Then User should click the register button