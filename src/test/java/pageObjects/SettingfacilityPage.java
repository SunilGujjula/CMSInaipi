package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingfacilityPage {
	
public WebDriver ldriver;
	
    public SettingfacilityPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement set;
    
    //facility
    @FindBy(xpath="//p[normalize-space()='Facility']")
    @CacheLookup
    WebElement facility;
    
    // Add facility
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement Addfacility;
    
   //Text group name
    @FindBy(xpath="//input[@name='facilityname']")
    @CacheLookup
    WebElement txtfac;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtgp;

    
 //Action methods
    
    public void set() {
		set.click();
	}


	public void facility() {
		facility.click();
	}


	public void Addfacility() {
		Addfacility.click();
	}


	public void txtfac() {
		txtfac.sendKeys("Text");
	}


	public void crtgp() {
		crtgp.click();
	}


}
