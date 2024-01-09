package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsubcomplaintPage {
public WebDriver ldriver;
	
    public SettingsubcomplaintPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement setcomsub;
    
    //complaint sub type
    @FindBy(xpath="//p[normalize-space()='Complaint Sub-Type']")
    @CacheLookup
    WebElement compltsub;
    
    // Add complaint sub type
    @FindBy(xpath="//button[normalize-space()='+ New Complaint']")
    @CacheLookup
    WebElement Addcmpltsub;
    
  //select complaint
    @FindBy(xpath="//option[normalize-space()='Complain']")
    @CacheLookup
    WebElement setcmplt;
   
   //Text complaint
    @FindBy(xpath="//input[@name='complaint']")
    @CacheLookup
    WebElement txtcmplt;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtsub;

    
//Action method
    
	public void setcomsub() {
		setcomsub.click();
	}


	public void compltsub() {
		compltsub.click();
	}


	public void Addcmpltsub() {
		Addcmpltsub.click();
	}
	
	public void setcmplt() {
		setcmplt.click();
	}

	public void txtcmplt() {
		txtcmplt.sendKeys("Test");
	}

	public void crtsub() {
		crtsub.click();
	}


	

}
