package HRMorangewithstructureformat;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
	HomePageLocators homepageLocators ;
	
	public HomePageActions(){
		homepageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homepageLocators);
	}
	
	public String getVerifyText() {
		return homepageLocators.verifyText.getText();
	}
}
