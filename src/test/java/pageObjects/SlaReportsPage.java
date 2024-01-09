package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlaReportsPage {
public WebDriver ldriver;
	
    public SlaReportsPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Reports
    @FindBy(xpath="//span[normalize-space()='assignment']")
    @CacheLookup
    WebElement Rpt;
    

    //click sla report
    @FindBy(xpath="(//p[normalize-space()='SLA Report'])")
    @CacheLookup
    WebElement SlaReport;
    
    //select filters
    @FindBy(xpath="(//span[normalize-space()='filter_list'])")
    @CacheLookup
    WebElement flts;
    
    //select date
    @FindBy(xpath="(//option[normalize-space()='This month'])")
    @CacheLookup
    WebElement Thismonth;

    //select level
    @FindBy(xpath="(//option[normalize-space()='Level 1'])")
    @CacheLookup
    WebElement Level;
    
  //click apply
    @FindBy(xpath="(//button[normalize-space()='Apply'])")
    @CacheLookup
    WebElement Aly;

    
    
  //Action method
	public void Rpt() {
		Rpt.click();
		
	}

	public void SlaReport() {
		SlaReport.click();
		
	}

	public void flts() {
		flts.click();
	}

	public void Thismonth() {
		Thismonth.click();
	}

	public void Level() {
		Level.click();
		
	}

	public void Aly() {
		Aly.click();
	}

}
