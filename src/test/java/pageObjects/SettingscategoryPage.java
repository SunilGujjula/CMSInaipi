package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingscategoryPage {
public WebDriver ldriver;
	
    public SettingscategoryPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement settings;
    
    //category
    @FindBy(xpath="//p[normalize-space()='Category']")
    @CacheLookup
    WebElement categoryf;
    
  //Add category
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement category;
    
    //Text category
    @FindBy(xpath="//input[@name='groupName']")
    @CacheLookup
    WebElement catname;
    
  //create category
    @FindBy(xpath="(//button[@type='submit'])[1]")
    @CacheLookup
    WebElement crt;
     
    
    
//Action methods

	public void settings() {
		settings.click();
	}

	public void categoryf() {
		categoryf.click();
	}

	public void category() {
		category.click();
	}

	public void catname() {
		catname.sendKeys("Test");
	}

	public void crt() {
		crt.click();
	}

}
