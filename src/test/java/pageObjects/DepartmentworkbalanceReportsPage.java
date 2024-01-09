package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentworkbalanceReportsPage {
public WebDriver ldriver;
	
    public DepartmentworkbalanceReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Rpts;
    

    //click sla report
    @FindBy(xpath="(//p[normalize-space()='Department Work-Balance Report'])")
    @CacheLookup
    WebElement DptReport;

    
 // Action menthods
    
	public void Rpts() {
		Rpts.click();
		
	}


	public void DptReport() {
		DptReport.click();
	}
	
	

}
