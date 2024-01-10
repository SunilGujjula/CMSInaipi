package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
public  WebDriver driver;
	
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public CustomereditPage customereditpage;
	
	
	public PageObjectManager (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public LoginPage getLoginpage()
	{
		loginpage= new LoginPage(driver);
		return loginpage;
	}
	
	public CustomerPage getCustomerpage()
	{
		customerpage= new CustomerPage(driver);
		return customerpage;
	}
	
	public CustomereditPage getCustomereditpage()
	{
		customereditpage= new CustomereditPage(driver);
		return customereditpage;
	}
	
	

}
