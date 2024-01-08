package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketfiltersPage {

public WebDriver ldriver;
	
    public TicketfiltersPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Ticket
    @FindBy(xpath="(//span[normalize-space()='confirmation_number'])[1]")
    @CacheLookup
    WebElement Ticketf;
    
  //click on Ticket filters
    @FindBy(xpath="//span[normalize-space()='filter_list']")
    @CacheLookup
    WebElement Addfilters;
    
  //select from date
    @FindBy(xpath="//input[@name='startdate']")
    @CacheLookup
    WebElement frmdate;
    
  //select Today date
    @FindBy(xpath="//input[@name='todate']")
    @CacheLookup
    WebElement todate;
    
  //select the priority
    @FindBy(xpath="//option[normalize-space()='Low']")
    @CacheLookup
    WebElement priority;
     
  //click on Create
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement createf;


    
    
//Action methods 
    public void Ticketf() {
    	Ticketf.click();
	}

	public void Addfilters() {
		Addfilters.click();
	}

	public void frmdate() {
		frmdate.sendKeys("01/01/2024");
	}

	public void todate() {
		todate.sendKeys("01/2024/03");
	}

	public void priority() {
		priority.click();
	}

	public void createf() {
		createf.click();
	}
    
    
}
