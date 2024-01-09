package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingdepartmentPage {

public WebDriver ldriver;
	
    public SettingdepartmentPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement set;
    
    //department
    @FindBy(xpath="//p[normalize-space()='Department']")
    @CacheLookup
    WebElement dep;
    
    // Add department
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement Adddep;
    
  //Text fac name
    @FindBy(xpath="(//span[normalize-space()='Dubai'])[3]")
    @CacheLookup
    WebElement txtfac;
    
   //Text dep name
    @FindBy(xpath="//input[@name='departmentname']")
    @CacheLookup
    WebElement txtdep;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtgp;

    
//Action methods
    
	public void settin() {
		set.click();
	}


	public void dep() {
		dep.click();
	}


	public void Adddep() {
		Adddep.click();
	}


	public void txtfac() {
		txtfac.click();
	}


	public void txtdep() {
		txtdep.sendKeys("Test");
	}


	public void crtgp() {
		crtgp.click();
	}
}
