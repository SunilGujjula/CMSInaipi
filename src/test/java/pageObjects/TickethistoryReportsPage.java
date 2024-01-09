package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TickethistoryReportsPage {

public WebDriver ldriver;
	
    public TickethistoryReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Rpts;
    

    //click sla report
    @FindBy(xpath="(//p[normalize-space()='Ticket History Report'])")
    @CacheLookup
    WebElement TkthReport;
    
    
    //select filters
    @FindBy(xpath="(//button[@type=\"button\"])[5]")
    @CacheLookup
    WebElement fitr;
    
    //Text ticket-id
    @FindBy(xpath="(//input[@name='ticketid'])")
    @CacheLookup
    WebElement Tktid;
    
  //click apply
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement Aly;

    // Action menthods
    
	public void Rpts() {
		Rpts.click();
		
	}

	public void TkthReport() {
		TkthReport.click();
	}

	public void fitr() {
		fitr.click();
	}

	public void Tktid(String tktid) {
		Tktid.sendKeys("COM-20231222-0066");
	}

	public void Aly() {
		Aly.click();
	}

    
}
