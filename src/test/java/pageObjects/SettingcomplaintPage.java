package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingcomplaintPage {

public WebDriver ldriver;
	
    public SettingcomplaintPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement setcom;
    
    //complaint
    @FindBy(xpath="//p[normalize-space()='Complaint Type']")
    @CacheLookup
    WebElement complt;
    
    // Add complaint
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement Addcmplt;
   
   //Text complaint
    @FindBy(xpath="//input[@id='categoryName']")
    @CacheLookup
    WebElement txtcmplt;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtcall;

 //Action method
    
	public void setcom() {
		setcom.click();
	}

	public void complt() {
		complt.click();
	}

	public void Addcmplt() {
		Addcmplt.click();
	}

	public void txtcmplt() {
		txtcmplt.sendKeys("Test");
	}

	public void crtcall() {
		crtcall.click();
	}

}
