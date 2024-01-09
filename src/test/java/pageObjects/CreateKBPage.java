package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateKBPage {
	
public WebDriver ldriver;
	
    public CreateKBPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //KB
    @FindBy(xpath="(//span[normalize-space()='school'])[1]")
    @CacheLookup
    WebElement KB;
    
    //create KB
    @FindBy(xpath="(//p[normalize-space()='Create Knowledge Base'])")
    @CacheLookup
    WebElement crtKB;
    
  //create KBase
    @FindBy(xpath="(//span[normalize-space()='add'])")
    @CacheLookup
    WebElement createKB;
    
  //KBase title
    @FindBy(xpath="(//input[@name='title'])[1]")
    @CacheLookup
    WebElement KBtitle;
    
    //KBase arrow
    @FindBy(xpath="//mat-select[@id=\"category_id\"]")
    @CacheLookup
    WebElement arrow;
    
  //KBase group
    @FindBy(xpath="(//mat-select[@name=\"grpname\"])[1]")
    @CacheLookup
    WebElement grp;

   	//KBase description
     @FindBy(xpath="//*[@id=\"tiny-angular_49647627811704364121417_ifr\"]")
     @CacheLookup
     WebElement KBdec;
     
 	//KBase create
     @FindBy(xpath="(//button[normalize-space()='Create'])[1]")
     @CacheLookup
     WebElement KBcreate;

// Action methods

	public void KB() {
		KB.click();
		
	}

	public void crtKB() {
		crtKB.click();
		
	}

	public void createKB() {
		createKB.click();
	}

	public void KBtitle(String test) {
		KBtitle.sendKeys("Test");
	}
	
	public void arrow() {
		arrow.sendKeys("leave");
	}

	public void grp() {
		grp.sendKeys("casualleaves");
	}

	public void KBdec(String string) {
		KBdec.sendKeys("Test for testing");
	}

	public void KBcreate() {
		KBcreate.click();
	}
  

}
