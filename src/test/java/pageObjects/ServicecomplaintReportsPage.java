package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicecomplaintReportsPage {
	
public WebDriver ldriver;
	
    public ServicecomplaintReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement reportsfns;
    
    //service complaint reports
    @FindBy(xpath="//p[normalize-space()='Service Complaint Reports']")
    @CacheLookup
    WebElement servicecmplt;
    
    // Add filters
    @FindBy(xpath="//span[normalize-space()='filter_list']")
    @CacheLookup
    WebElement Addflts;
    
  //select month
    @FindBy(xpath="//option[normalize-space()='January']")
    @CacheLookup
    WebElement setcmplt;
    
  //create button
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement apply;

 
 //Action methods
    
   
	public void reportsfns() {
		reportsfns.click();
	}


	public void servicecmplt() {
		servicecmplt.click();
	}


	public void Addflts() {
		Addflts.click();
	}


	public void setcmplt() {
		setcmplt.click();
	}


	public void apply() {
		apply.click();
	}

}
