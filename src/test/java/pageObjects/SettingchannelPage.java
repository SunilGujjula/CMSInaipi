package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingchannelPage {

public WebDriver ldriver;
	
    public SettingchannelPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Settings
    @FindBy(xpath="//span[normalize-space()='settings']")
    @CacheLookup
    WebElement settin;
    
    //channel
    @FindBy(xpath="(//p[normalize-space()='Channel'])[2]")
    @CacheLookup
    WebElement channel;
    
    // Add channel
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement Addchannel;
    
   //Text channel name
    @FindBy(xpath="//input[@name='channelName']")
    @CacheLookup
    WebElement txtchl;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement crtchl;

    
 //Action methods
    
	public void settin() {
		settin.click();
	}


	public void channel() {
		channel.click();
	}


	public void Addchannel() {
		Addchannel.click();
	}


	public void txtchl(String string) {
		txtchl.sendKeys("Test");
	}


	public void crtchl() {
		crtchl.click();
	}
	
	

}
