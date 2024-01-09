package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AgentworkbalanceReportsPage;
import pageObjects.AuditReportsPage;
import pageObjects.ComplaintReportsPage;
import pageObjects.CreateKBPage;
import pageObjects.CustomerPage;
import pageObjects.CustomereditPage;
import pageObjects.DepartmentworkbalanceReportsPage;
import pageObjects.KBviewPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.MonthlycaseReportsPage;
import pageObjects.ServicecomplaintReportsPage;
import pageObjects.SettingcallreasonPage;
import pageObjects.SettingcasetypePage;
import pageObjects.SettingchannelPage;
import pageObjects.SettingcomplaintPage;
import pageObjects.SettingdepartmentPage;
import pageObjects.SettingfacilityPage;
import pageObjects.SettinggroupPage;
import pageObjects.SettingscategoryPage;
import pageObjects.SettingsubcomplaintPage;
import pageObjects.SlaReportsPage;
import pageObjects.TicketPage;
import pageObjects.TicketReportsPage;
import pageObjects.TicketfiltersPage;
import pageObjects.TickethistoryReportsPage;

public class Baseclass {


	public static WebDriver driver;
	public LoginPage log;
	public CustomerPage Cust;
	public CustomereditPage custedt;
	public TicketPage AddTk;
	public TicketfiltersPage Tkflt;
	public TicketReportsPage Tckrpt;
	public AuditReportsPage Audit;
	public SlaReportsPage SLA;
	public ComplaintReportsPage cmplt;
	public AgentworkbalanceReportsPage Agent;
	public DepartmentworkbalanceReportsPage Dpt;
	public TickethistoryReportsPage Tkth;
	public ServicecomplaintReportsPage scmplt;
	public MonthlycaseReportsPage mntly;
	public CreateKBPage KBC;
	public KBviewPage KBV;
	public SettingscategoryPage Cat;
	public SettinggroupPage grp;
	public SettingfacilityPage fct;
	public SettingcasetypePage cas;
	public SettingdepartmentPage dep;
	public SettingchannelPage chl;
	public SettingcallreasonPage call;
	public SettingcomplaintPage Cmplt;
	public SettingsubcomplaintPage subcmplt;
	public LogoutPage Lg;
	

	 public static WebDriver getDriver(){
	        if (driver == null) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        }
	        return driver;
	    }

		public static String randomestring() {
			String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		    return (generatedString1);
		}
	

}
