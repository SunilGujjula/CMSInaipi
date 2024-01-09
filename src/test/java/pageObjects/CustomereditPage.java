package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomereditPage {

	
public WebDriver ldriver;
	
    public CustomereditPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
   
    
  //Text customer...............................................edit details 
    @FindBy(xpath="//input[@type='search']")
    @CacheLookup
    WebElement secust;
    
  //Search customer 
    @FindBy(xpath="//span[normalize-space()='search']")
    @CacheLookup
    WebElement search;
    
  //edit customer 
    @FindBy(xpath="//span[normalize-space()='edit']")
    @CacheLookup
    WebElement edit;
    
  //edit last name 
    @FindBy(xpath="(//input[@id='last_name'])[2]")
    @CacheLookup
    WebElement lstname;
    
    
  //update 
    @FindBy(xpath="(//button[normalize-space()='Update'])[2]")
    @CacheLookup
    WebElement update;
    
  //edit action methods
	
  	public void secust() {
  		secust.sendKeys("SunilGujjula");
  	}

  	public void search() {
  		search.click();
  	}

  	public void edit() {
  		edit.click();
  	}

  	public void lstname() {
  		lstname.sendKeys("gujjula");
  	}

  	public void update() {
  		update.click();
  	}
    
}
