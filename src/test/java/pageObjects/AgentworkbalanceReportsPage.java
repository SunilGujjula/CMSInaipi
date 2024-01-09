package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentworkbalanceReportsPage {

	
public WebDriver ldriver;
	
    public AgentworkbalanceReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Rpts;
    

    //click sla report
    @FindBy(xpath="(//p[normalize-space()='Agent Work-Balance Report'])")
    @CacheLookup
    WebElement AgentReport;

    
//Action menthods
    
	public void Rpts() {
		Rpts.click();
	}


	public void AgentReport() {
		AgentReport.click();
		
	}

}
