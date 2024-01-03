package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuditReportsPage {
public WebDriver ldriver;
	
    public AuditReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Report;
    
    // Audit Reports
    @FindBy(xpath="//p[normalize-space()='Audit Report']")
    @CacheLookup
    WebElement Adit;
    
  //select filters
    @FindBy(xpath="//span[normalize-space()='filter_list']")
    @CacheLookup
    WebElement fit;
    
    //select date
    @FindBy(xpath="(//option[normalize-space()='This Month'])")
    @CacheLookup
    WebElement dt;
    
  //click apply
    @FindBy(xpath="(//button[normalize-space()='Apply'])")
    @CacheLookup
    WebElement Aly;
    
    
    
    
    //Action methods

	public void Report() {
		Report.click();
		
	}

	public void Adit() {
		Adit.click();
	}

	public void fit() {
		fit.click();
	}

	public void dt() {
		dt.click();
		
	}

	public void Aly() {
		Aly.click();
	}

}
