package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthlycaseReportsPage {

public WebDriver ldriver;
	
    public MonthlycaseReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement mntrpts;
    

    //monthlycase report
    @FindBy(xpath="//p[normalize-space()='Monthly Case Status Report']")
    @CacheLookup
    WebElement cmptReport;

    
// Action methods
    
	public void mntrpts() {
		mntrpts.click();
	}


	public void cmptReport() {
		cmptReport.click();
	}
      
    
}
