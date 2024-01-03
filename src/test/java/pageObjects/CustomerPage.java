package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
public WebDriver ldriver;
	
    public CustomerPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Customer
    @FindBy(xpath="(//span[normalize-space()='person'])[1]")
    @CacheLookup
    WebElement customerf;
    
    //Add customer 
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement Addcustomer;
    
  //Add customer  name
    @FindBy(xpath="(//input[@id=\"first_name\"])[1]")
    @CacheLookup
    WebElement names;
    
  //Add customer  mobile number
    @FindBy(xpath="(//*[@id=\"mobile_number\"])[1]")
    @CacheLookup
    WebElement mobile;
    
  //Add customer  secoundary number
    @FindBy(xpath="(//input[@id=\"secondary_number\"])[1]")
    @CacheLookup
    WebElement secoundary;
    
  //Add customer  Email
    @FindBy(xpath="(//input[@id=\"email\"])[1]")
    @CacheLookup
    WebElement email;
    
  //Add customer  Address
    @FindBy(xpath="(//input[@id=\"customer_address\"])[1]")
    @CacheLookup
    WebElement address;
    
    
    
  //Add customer  create
    @FindBy(xpath="(//button[normalize-space()='Create'])[1]")
    @CacheLookup
    WebElement create;

  //Action methods
    
    
	public void customer() {
		// TODO Auto-generated method stub
		customerf.click();
	}

	public void Addcustomer() {
		// TODO Auto-generated method stub
		Addcustomer.click();
	}

	public void names(String name) {
		// TODO Auto-generated method stub
		names.sendKeys("Test");
	}

	public void mobile(String mobilenumber) {
		// TODO Auto-generated method stub
		mobile.sendKeys("9873869666");
	}

	public void secoundary(String secoundarys) {
		// TODO Auto-generated method stub
		secoundary.sendKeys("89734623663");
	}

	public void email(String emails) {
		// TODO Auto-generated method stub
		email.sendKeys("Test@gmail.com");
	}
	
	public void address(String addres) {
		// TODO Auto-generated method stub
		address.sendKeys("bnglr");
	}
	
	
	public void create() {
		// TODO Auto-generated method stub
		create.click();
	}
	
}
