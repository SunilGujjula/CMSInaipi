package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
    public LoginPage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //username
    @FindBy(id="usernaname")
    @CacheLookup
    WebElement txtusernaname;
    
    //password
    @FindBy(id="password")
    @CacheLookup
    WebElement txtpassword;
    
    //click
    @FindBy(xpath="//button[normalize-space()='Login']")
    @CacheLookup
    WebElement btnLogin;
    
    
    //Action method
    public void setUserName(String email) {
    	txtusernaname.clear();
    	txtusernaname.sendKeys(email);
    }
    
    public void setpassword(String password) {
    	txtpassword.clear();
    	txtpassword.sendKeys(password);
    }
    
    public void ClickLogin() throws InterruptedException {
    	btnLogin.click();
    	Thread.sleep(2000);
    }

}
