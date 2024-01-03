package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettinggroupPage {
	
public WebDriver ldriver;
	
    public SettinggroupPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement setting;
    
    //group
    @FindBy(xpath="//p[normalize-space()='Group']")
    @CacheLookup
    WebElement group;
    
    // Add group
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement Addgroup;
    
    // select category
    @FindBy(xpath="(//span[normalize-space()='test'])")
    @CacheLookup
    WebElement Secat;
    
   //Text group name
    @FindBy(xpath="//input[@name='groupName']")
    @CacheLookup
    WebElement txtgp;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtgp;

    
 //Action methods
    public void setting() {
		setting.click();
	}


	public void group() {
		group.click();
	}


	public void Addgroup() {
		Addgroup.click();
	}


	public void Secat() {
		Secat.click();
	}


	public void txtgp(String string) {
		txtgp.sendKeys("Testing");
	}


	public void crtgp() {
		crtgp.click();
	}



    
    
    
    
    

}
