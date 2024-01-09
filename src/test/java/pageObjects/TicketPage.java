package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage {
public WebDriver ldriver;
	
    public TicketPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Ticket
    @FindBy(xpath="(//span[normalize-space()='confirmation_number'])[1]")
    @CacheLookup
    WebElement Ticket;
    
  //Add Ticket
    @FindBy(xpath="(//div[normalize-space()='Create Ticket'])")
    @CacheLookup
    WebElement AddTicket;
    
  //Text mobile number
    @FindBy(xpath="//input[@name='searchInput']")
    @CacheLookup
    WebElement Txtm;
    
  //click on search button
    @FindBy(xpath="//span[@class=\"ng-star-inserted\"]")
    @CacheLookup
    WebElement searchbtn;
    
  //click on radio button
    @FindBy(xpath="//input[@id=\"flexRadioDefault1\"]")
    @CacheLookup
    WebElement radio;
    
    
  //click on search button
    @FindBy(xpath="(//span[normalize-space()='Submit'])")
    @CacheLookup
    WebElement submitbtn;
    
    
  //select case type
    @FindBy(xpath="(//option[normalize-space()='Enquiry'])")
    @CacheLookup
    WebElement casetype;
    
  //select complaint
    @FindBy(xpath="(//option[normalize-space()='Complain'])")
    @CacheLookup
    WebElement complaint;
    
    //select complaint sub type
    @FindBy(xpath="(//option[normalize-space()='Inquiry'])")
    @CacheLookup
    WebElement subtype;
    
  //select channel
    @FindBy(xpath="(//option[normalize-space()='whatsapp'])")
    @CacheLookup
    WebElement channel;
    
  //Text Title
    @FindBy(xpath="(//input[@name='title'])")
    @CacheLookup
    WebElement Title;
    
    
  //click on Create
    @FindBy(xpath=" //button[@type=\"submit\"]")
    @CacheLookup
    WebElement create;

 //Action methods
    
   
	public void Ticket() {
		Ticket.click();
		
	}

	public void AddTicket() {
		AddTicket.click();
		
	}

	public void Txtm(String txt) {
		Txtm.sendKeys("9873869666");
		
	}

	public void searchbtn() {
		searchbtn.click();
		
	}
	
	public void radio() {
		radio.click();
		
	}

	public void submitbtn() {
		submitbtn.click();
		
	}

	public void casetype() {
		casetype.click();
		
	}

	public void complaint() {
		complaint.click();
		
	}

	public void subtype() {
		subtype.click();
		
	}

	public void channel() {
		channel.click();
		
	}

	public void Title(String string) {
		Title.sendKeys("Test");
		
	}

	public void create() {
		create.click();
	}
 

}
