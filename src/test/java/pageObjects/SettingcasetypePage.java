package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingcasetypePage {
public WebDriver ldriver;
	
    public SettingcasetypePage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement settings;
    
    //casetype
    @FindBy(xpath="//p[normalize-space()='Case Type']")
    @CacheLookup
    WebElement casetype;
    
    // Add casetype
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement Addcase;
    
   //Text case name
    @FindBy(xpath="//input[@name='channelName']")
    @CacheLookup
    WebElement txtcase;
    
    //Text case label name
    @FindBy(xpath="//input[@name='casetypelabel']")
    @CacheLookup
    WebElement txtlab;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtcase;

    
//Action methods
	public void settings() {
		settings.click();
	}


	public void casetype() {
		casetype.click();
	}


	public void Addcase() {
		Addcase.click();
	}


	public void txtcase() {
		txtcase.sendKeys("enquary");
	}


	public void txtlab() {
		txtlab.sendKeys("Test");
	}


	public void crtcase() {
		crtcase.click();
	}
	

}
