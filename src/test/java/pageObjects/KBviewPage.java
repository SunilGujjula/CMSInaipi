package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBviewPage {

public WebDriver ldriver;
	
    public KBviewPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //KB
    @FindBy(xpath="//span[normalize-space()='school']")
    @CacheLookup
    WebElement KBv;
    
    //create KB
    @FindBy(xpath="(//p[normalize-space()='Knowledge Base'])[3]")
    @CacheLookup
    WebElement KBview;
    
    // KB filters
    @FindBy(xpath="//div[normalize-space()='Filter']")
    @CacheLookup
    WebElement KBflt;
    
 // KB category
    @FindBy(xpath="//option[normalize-space()='test']")
    @CacheLookup
    WebElement KBcat;
    
 // KB group
    @FindBy(xpath="//option[normalize-space()='test1']")
    @CacheLookup
    WebElement KBgp;
    
 // KB Apply
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement KBapply;

    
//Action methods
    
	public void KB() {
		KBv.click();
	}


	public void KBview() {
		KBview.click();
	}


	public void KBflt() {
		KBflt.click();
	}


	public void KBcat() {
		KBcat.click();
	}


	public void KBgp() {
		KBgp.click();
	}


	public void KBapply() {
		KBapply.click();
	}
}
