Feature: sameple use of scenarioOutline in cucumber in OrangeHRM

Background:
   Given use the url "https://opensource-demo.orangehrmlive.com"
@InValidCredentials
  Scenario Outline: Verification of Login using valid credentials
  
 
		When User enters in  username as "<Admin>"
	  And User enters  in password as "<admin123>"
		And User click the login button
  	Then User should be able to login unsucessfully with error messsage

    Examples: 
      | Admin  |  admin123|
      | name1  |   success |
      | name2  |    Fail   |


      