package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintReportsPage {
	
public WebDriver ldriver;
	
    public ComplaintReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Rpts;
    

    //complaint report
    @FindBy(xpath="(//p[normalize-space()='Complaint Report'])")
    @CacheLookup
    WebElement cmptReport;

    
   //Action reports
    
	public void Rpts() {
		Rpts.click();
		
	}


	public void cmptReport() {
		cmptReport.click();
		
	}

	
}
