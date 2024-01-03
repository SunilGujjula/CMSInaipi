package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingcallreasonPage {
	
public WebDriver ldriver;
	
    public SettingcallreasonPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement setcall;
    
    //call reason
    @FindBy(xpath="//p[normalize-space()='Call Reason']")
    @CacheLookup
    WebElement callr;
    
    // Add call reason
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement Addcall;
   
   //Text call reason name
    @FindBy(xpath="//input[@name='callreasonname']")
    @CacheLookup
    WebElement txtcall;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtcall;

 //Action methods
    
	public void setcall() {
		setcall.click();
	}

	public void callr() {
		callr.click();
	}

	public void Addcall() {
		Addcall.click();
	}

	public void txtcall() {
		txtcall.sendKeys("test");
	}

	public void crtcall() {
		crtcall.click();
	}
	
	
	

}
