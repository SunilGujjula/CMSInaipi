package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketReportsPage {
public WebDriver ldriver;
	
    public TicketReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="(//span[normalize-space()='assignment'])")
    @CacheLookup
    WebElement Reports;
    
    //click ticket report
    @FindBy(xpath="(//p[normalize-space()='Ticket Report'])")
    @CacheLookup
    WebElement TKReport;
    
    //select filters
    @FindBy(xpath="(//span[normalize-space()='filter_list'])[2]")
    @CacheLookup
    WebElement filts;
    
  //select date
    @FindBy(xpath="(//option[normalize-space()='This Month'])")
    @CacheLookup
    WebElement date;

    //select date
    @FindBy(xpath="(//option[normalize-space()='Open Tickets'])")
    @CacheLookup
    WebElement opentickets;
    
  //click apply
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement Apply;
    
    //Action methods
    
	public void Reports() {
		Reports.click();
		
	}

	public void TKReport() {
		TKReport.click();
		
	}

	public void filts() {
		filts.click();
		
	}

	public void date() {
		date.click();
		
	}

	public void opentickets() {
		opentickets.click();
		
	}

	public void Apply() {
		Apply.click();
		
	}
	
	

}
