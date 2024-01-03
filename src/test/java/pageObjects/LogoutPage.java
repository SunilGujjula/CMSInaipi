package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
public WebDriver ldriver;
	
    public LogoutPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Profile
    @FindBy(xpath="(//span[normalize-space()='person'])[3]")
    @CacheLookup
    WebElement profile;
    
    //Logout
    @FindBy(xpath="(//span[normalize-space()='logout'])")
    @CacheLookup
    WebElement logout;

    
 //Action methods
    
	public void profile() {
		profile.click();
		
	}


	public void logout() {
		logout.click();
		
	}

}
