package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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


public class stepDefinition extends Baseclass{
	
	@Given("User open url {string}")
	public void user_open_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log=new LoginPage(driver);
		
		
		driver.get("https://inaipi.ae/v2/login");
		driver.manage().window().maximize();
		
	}
	@When("User enter the email {string}")
	public void user_enter_the_email(String email) {
		log.setUserName(email);
	}
	@When("User enter the password {string}")
	public void user_enter_the_password(String password) {
		log.setpassword(password);
	}
	@Then("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		log.ClickLogin();
		Thread.sleep(2000);
	}
	
	// customer details

    @Given("User click on the customer")
    public void user_click_on_the_customer() throws InterruptedException {
    	Cust=new CustomerPage(driver);
    	Cust.customer(); 
        Thread.sleep(2000);
    }

    @When("User have to add the customer")
    public void user_have_to_add_the_customer() throws InterruptedException {
    	Cust.Addcustomer();
        Thread.sleep(2000);
    }

    @Then("User have to text the customer name")
    public void user_have_to_text_the_customer_name() throws InterruptedException {
    	Cust.names("sunil");
        Thread.sleep(2000);
    }

    @And("User have to text the mobile number")
    public void user_have_to_text_the_mobile_number() throws InterruptedException {
    	Cust.mobile("9873869666");
        Thread.sleep(2000);
    }
    
    @Then("User have to text the secoundary number")
    public void user_have_to_text_the_secoundary_number() throws InterruptedException {
    	Cust.secoundary("89734623663");
    	Thread.sleep(2000);
    }

    @Then("User have to text the Email")
    public void user_have_to_text_the_email() throws InterruptedException {
    	Cust.email("Test@gmail.com");
    	Thread.sleep(2000);
    }

    @Then("User have to text the Customer Address")
    public void user_have_to_text_the_customer_address() throws InterruptedException {
    	Cust.address("bnglr");
    	Thread.sleep(2000);
    }

    @Then("User have to click on apply button")
    public void user_have_to_click_on_apply_button() throws InterruptedException {
    	Cust.create();
        Thread.sleep(2000);
    }
    
    
//customer edit and delete

    @Given("User text on customer name")
    public void user_text_on_customer_name() throws InterruptedException {
    	custedt=new CustomereditPage(driver);
    	custedt.secust();
        Thread.sleep(2000);
    }

    @When("User click on the search button")
    public void user_click_on_the_search_button() throws InterruptedException {
    	custedt.search();
    	Thread.sleep(2000);
    }


    @And("User click on edit button")
    public void user_click_on_edit_button() throws InterruptedException {
    	custedt.edit();
    	Thread.sleep(2000);
    }

    @And("User text on last name")
    public void user_text_on_last_name() throws InterruptedException {
    	custedt.lstname();
    	Thread.sleep(2000);
    }

    @Then("User click on update button")
    public void user_click_on_update_button() throws InterruptedException {
    	custedt.update();
    	Thread.sleep(2000);
    }
	
  //Ticket creating 
    
    @Given("User click on Ticket functionality")
    public void user_click_on_ticket_functionality() throws InterruptedException {
    	AddTk=new TicketPage(driver);
    	AddTk.Ticket(); 
        Thread.sleep(2000);
    }

    @Then("User click on Add Ticket button")
    public void user_click_on_add_ticket_button() throws InterruptedException {
    	AddTk.AddTicket();
    	 Thread.sleep(2000);
    }

    @Then("User Text on mobile number")
    public void user_text_on_mobile_number() throws InterruptedException {
    	AddTk.Txtm("9873869666");
    	 Thread.sleep(2000);
    }

    @Then("User click on search button")
    public void user_click_on_search_button() throws InterruptedException {
    	AddTk.searchbtn();
    	 Thread.sleep(2000);
    }
    
    @When("User click on radio button")
    public void user_click_on_radio_button() throws InterruptedException {
    	AddTk.radio();
   	    Thread.sleep(2000);
    }

    @Then("User click on submit button")
    public void user_click_on_submit_button() throws InterruptedException {
    	AddTk.submitbtn();
   	    Thread.sleep(2000);
    }


    @Then("User select the case type")
    public void user_select_the_case_type() throws InterruptedException {
    	AddTk.casetype();
    	 Thread.sleep(2000);
    }

    @Then("User select the complaint type")
    public void user_select_the_complaint_type() throws InterruptedException {
    	AddTk.complaint();
    	 Thread.sleep(2000);
    }

    @Then("User select the complaint sub type")
    public void user_select_the_complaint_sub_type() throws InterruptedException {
    	AddTk.subtype();
    	 Thread.sleep(2000);
    }

    @Then("User select the channel")
    public void user_select_the_channel() throws InterruptedException {
    	AddTk.channel();
    	 Thread.sleep(2000);
    }

    @Then("User Text the Title")
    public void user_text_the_title() throws InterruptedException {
    	AddTk.Title("Test");
    	 Thread.sleep(2000);
    }

    @Then("User click on create button")
    public void user_click_on_create_button() throws InterruptedException {
    	AddTk.create();
    	 Thread.sleep(2000);
    }
    
    
// Tickets functionality 
    
    @Given("User click on Ticket functionalitys")
    public void user_click_on_ticket_functionalitys() throws InterruptedException {
    	Tkflt=new TicketfiltersPage(driver);
    	Tkflt.Ticketf(); 
        Thread.sleep(5000);
    }
    
    @When("User select the filters")
    public void user_select_the_filters() throws InterruptedException {
    	Tkflt.Addfilters(); 
        Thread.sleep(5000);
    }

    @Then("User select the from date")
    public void user_select_the_from_date() throws InterruptedException {
    	Tkflt.frmdate(); 
        Thread.sleep(2000);
    }

    @Then("User select the today date")
    public void user_select_the_today_date() throws InterruptedException {
    	Tkflt.todate(); 
        Thread.sleep(2000);
    }

    @When("User select the priority")
    public void user_select_the_priority() throws InterruptedException {
    	Tkflt.priority(); 
        Thread.sleep(2000);
    }

    @Then("User click on apply buttons")
    public void user_click_on_apply_buttons() throws InterruptedException {
    	Tkflt.createf(); 
        Thread.sleep(2000);
    }
    
 //Reports functionality
    
    
    //Ticket Reports
    
    @Given("User click on Reports functionality")
    public void user_click_on_reports_functionality() throws InterruptedException {
    	Tckrpt=new TicketReportsPage(driver);
    	Tckrpt.Reports(); 
        Thread.sleep(4000);
    	
    }

    @When("User click on Ticket Reports")
    public void user_click_on_ticket_reports() throws InterruptedException {
    	Tckrpt.TKReport();
    	Thread.sleep(2000);
    }

    @Then("User click on filters")
    public void user_click_on_filters() throws InterruptedException {
    	Tckrpt.filts();
    	Thread.sleep(2000);
    }

    @Then("User select the date")
    public void user_select_the_date() throws InterruptedException {
    	Tckrpt.date();
    	Thread.sleep(2000);
    }

    @Then("User select the status")
    public void user_select_the_status() throws InterruptedException {
    	Tckrpt.opentickets();
    	Thread.sleep(2000);
    }
    
    @Then("User click on Apply button")
    public void user_click_on_apply_button() throws InterruptedException {
    	Tckrpt.Apply();
    	Thread.sleep(2000);
    }

    
 //Audit Reports 
    
    @Given("User click on Report")
    public void user_click_on_report() throws InterruptedException {
    	Audit=new AuditReportsPage(driver);
    	Audit.Report();
    	Thread.sleep(4000);
    }

    @When("User click on Audit Reports")
    public void user_click_on_audit_reports() throws InterruptedException {
    	Audit.Adit();
    	Thread.sleep(2000);
    }

    @Then("User click on filter")
    public void user_click_on_filter() throws InterruptedException {
    	Audit.fit();
    	Thread.sleep(2000);
    }

    @Then("User select on date")
    public void user_select_on_date() throws InterruptedException {
    	Audit.dt();
    	Thread.sleep(2000);
    }

    @Then("User click on Apply")
    public void user_click_on_apply() throws InterruptedException {
    	Audit.Aly();
    	Thread.sleep(4000);
    }

    
//SLA Reports
    
    @Given("User click on Reports function")
    public void user_click_on_reports_function() throws InterruptedException {
    	SLA=new SlaReportsPage(driver);
    	SLA.Rpt();
    	Thread.sleep(4000);
    }

    @When("User click on SLA Reports")
    public void user_click_on_sla_reports() throws InterruptedException {
    	SLA.SlaReport();
    	Thread.sleep(2000);
    }

    @Then("User click on filterss")
    public void user_click_on_filterss() throws InterruptedException {
    	SLA.flts();
    	Thread.sleep(2000);
    }

    @Then("User select the Todate")
    public void user_select_the_todate() throws InterruptedException {
    	SLA.Thismonth();
    	Thread.sleep(2000);
    }

    @Then("User select the Select levels")
    public void user_select_the_select_levels() throws InterruptedException {
    	SLA.Level();
    	Thread.sleep(2000);
    }

    @Then("User click on Applys")
    public void user_click_on_applys() throws InterruptedException {
    	SLA.Aly();
    	Thread.sleep(4000);
    }
    
//Complaint reports
    
    @Given("User click on Report funct")
    public void user_click_on_report_funct() throws InterruptedException {
    	cmplt=new ComplaintReportsPage(driver);
    	cmplt.Rpts();
    	Thread.sleep(4000);
    }

    @When("User click on Complaint Reports")
    public void user_click_on_complaint_reports() throws InterruptedException {
    	cmplt.cmptReport();
    	Thread.sleep(2000);
    }

 //Agent work balance
    
    @Given("User click on the Reports functionality")
    public void user_click_on_the_reports_functionality() throws InterruptedException {
    	Agent=new AgentworkbalanceReportsPage(driver);
    	Agent.Rpts();
    	Thread.sleep(4000);
    }

    @When("User click on Agent work balance Reports")
    public void user_click_on_agent_work_balance_reports() throws InterruptedException {
    	Agent.AgentReport();
    	Thread.sleep(2000);
    }
    
   //Department work balance 

    @Given("User click on Report functions")
    public void user_click_on_report_functions() throws InterruptedException {
    	Dpt=new DepartmentworkbalanceReportsPage(driver);
    	Dpt.Rpts();
    	Thread.sleep(4000);
    }

    @When("User click on Department work balance Reports")
    public void user_click_on_department_work_balance_reports() throws InterruptedException {
    	Dpt.DptReport();
    	Thread.sleep(2000);
    }

    
 //Ticket History reports
    
    @Given("User click Report functionality")
    public void user_click_report_functionality() throws InterruptedException{
    	Tkth=new TickethistoryReportsPage(driver);
    	Tkth.Rpts();
    	Thread.sleep(2000);
    }

    @When("User click on Ticket history Reports")
    public void user_click_on_ticket_history_reports() throws InterruptedException {
    	Tkth.TkthReport();
    	Thread.sleep(2000);
    }

    @Then("User click on filts")
    public void user_click_on_filts() throws InterruptedException {
    	Tkth.fitr();
    	Thread.sleep(2000);
    }

    @Then("User search the ticketid")
    public void user_search_the_ticketid() throws InterruptedException {
    	Tkth.Tktid("COM-20231222-0066");
    	Thread.sleep(2000);
    }

    @Then("User click on applys buttons")
    public void user_click_on_applys_buttons() throws InterruptedException {
    	Tkth.Aly();
    	Thread.sleep(2000);
    }
   
// service complaint reports........
    
    @Given("User click on reports")
    public void user_click_on_reports() throws InterruptedException {
    	scmplt=new ServicecomplaintReportsPage(driver);
    	scmplt.reportsfns();
    	Thread.sleep(2000);
    }

    @When("User click on service complaint reports")
    public void user_click_on_service_complaint_reports() throws InterruptedException {
    	scmplt.servicecmplt();
    	Thread.sleep(2000);
    }

    @Then("User click on filters button")
    public void user_click_on_filters_button() throws InterruptedException {
    	scmplt.Addflts();
    	Thread.sleep(2000);
    }

    @Then("User select on january month")
    public void user_select_on_january_month() throws InterruptedException {
    	scmplt.setcmplt();
    	Thread.sleep(2000);
    }
    
    @Then("User select the facility field")
    public void user_select_the_facility_field() throws InterruptedException {
    	scmplt.fact();
    	Thread.sleep(2000);
    }

    @Then("User select the department field")
    public void user_select_the_department_field() throws InterruptedException {
    	scmplt.depmt();
    	Thread.sleep(2000);
    }

    @Then("User click on apply button")
    public void user_click_on_apply_button1() throws InterruptedException {
    	scmplt.apply();
    	Thread.sleep(2000);
    }

    
//monthly case status reports
    @Given("User click on monthly reports")
    public void user_click_on_monthly_reports() throws InterruptedException {
    	mntly=new MonthlycaseReportsPage(driver);
    	mntly.mntrpts();
    	Thread.sleep(2000);
    }

    @When("User click on Monthly Case Status reports")
    public void user_click_on_monthly_case_status_reports() throws InterruptedException {
    	mntly.cmptReport();
    	Thread.sleep(2000);
    }
    
// Knowledge Base 
    
    @Given("User click on Knowledgebase")
    public void user_click_on_knowledgebase() throws InterruptedException {
    	KBC=new CreateKBPage(driver);
    	KBC.KB();
    	Thread.sleep(2000);
    }

    @When("User click on Create KB")
    public void user_click_on_create_kb() throws InterruptedException {
    	KBC.crtKB();
    	Thread.sleep(2000);
    }

    @Then("User click on Create KnowledgeBase")
    public void user_click_on_create_knowledge_base() throws InterruptedException {
    	KBC.createKB();
    	Thread.sleep(2000);
    }

    @Then("User Text on Title")
    public void user_text_on_title() throws InterruptedException {
    	KBC.KBtitle("Test");
    	Thread.sleep(2000);
    }

    @Then("User select the arrow")
    public void user_select_the_arrow() throws InterruptedException {
    	KBC.arrow();
    	Thread.sleep(2000);
    }
    

    @Then("User select the group")
    public void user_select_the_group() throws InterruptedException {
    	KBC.grp();
    	Thread.sleep(2000);
    }

    @Then("User Text on Description")
    public void user_text_on_description() throws InterruptedException {
    	KBC.KBdec("Test for testing");
    	Thread.sleep(2000);
    }

    @Then("User click on Create buttons")
    public void user_click_on_create_buttons() throws InterruptedException {
    	KBC.KBcreate();
    	Thread.sleep(2000);
    }

    
    
// KB View
    
    @Given("User click on Knowledge base")
    public void user_click_on_knowledge_base() throws InterruptedException {
    	KBV=new KBviewPage(driver);
    	KBV.KB();
    	Thread.sleep(4000);
    }

    @When("User click on Create KB view")
    public void user_click_on_create_kb_view() throws InterruptedException {
    	KBV.KBview();
    	Thread.sleep(3000);
    }

    @Then("User click on kb filters")
    public void user_click_on_kb_filters() throws InterruptedException {
    	KBV.KBflt();
    	Thread.sleep(2000);
    }

    @Then("User select the kb category")
    public void user_select_the_kb_category() throws InterruptedException {
    	KBV.KBcat();
    	Thread.sleep(2000);
    }

    @Then("User select the kb group")
    public void user_select_the_kb_group() throws InterruptedException {
    	KBV.KBgp();
    	Thread.sleep(2000);
    }

    @Then("User click on Apply btn")
    public void user_click_on_apply_btn() throws InterruptedException {
    	KBV.KBapply();
    	Thread.sleep(2000);
    }

    
 //Settings master 
    
    @Given("User click on settings")
    public void user_click_on_settings() throws InterruptedException {
    	Cat=new SettingscategoryPage(driver);
    	Cat.settings();
    	Thread.sleep(4000);
    }

    @When("User click on category")
    public void user_click_on_category() throws InterruptedException {
    	Cat.categoryf();
    	Thread.sleep(2000);
    }

    @Then("User click on Add category")
    public void user_click_on_add_category() throws InterruptedException {
    	Cat.category();
    	Thread.sleep(2000);
    }

    @Then("User Text on category")
    public void user_text_on_category() throws InterruptedException {
    	Cat.catname();
    	Thread.sleep(2000);
    }
    
    @Then("User click on submits")
    public void user_click_on_submits() throws InterruptedException {
    	Cat.crt();
    	Thread.sleep(2000);
    }
    
    
//setting group functionality

    @Given("User click on setting]")
    public void user_click_on_setting() throws InterruptedException {
    	grp=new SettinggroupPage(driver);
    	grp.setting();
    	Thread.sleep(2000);
    }

    @When("User click on group")
    public void user_click_on_group() throws InterruptedException {
    	grp.group();
    	Thread.sleep(2000);
    }

    @Then("User click on Add group")
    public void user_click_on_add_group() throws InterruptedException {
    	grp.Addgroup();
    	Thread.sleep(2000);
    }

    @Then("User select category")
    public void user_select_category() throws InterruptedException {
    	grp.Secat();
    	Thread.sleep(2000);
    }

    @Then("User text on Group")
    public void user_text_on_group() throws InterruptedException {
    	grp.txtgp("Testing");
    	Thread.sleep(2000);
    }

    @Then("User click on the create button")
    public void user_click_on_the_create_button() throws InterruptedException {
    	grp.crtgp();
    	Thread.sleep(2000);
    }
    
    
// Settings Facility
    
    @Given("User click on set")
    public void user_click_on_set() throws InterruptedException {
    	fct=new SettingfacilityPage(driver);
    	fct.set();
    	Thread.sleep(2000);
    }
    
    @When("User click on facility")
    public void user_click_on_facility() throws InterruptedException {
    	fct.facility();
    	Thread.sleep(2000);
    }

    @Then("User click on Add facility")
    public void user_click_on_add_facility() throws InterruptedException {
    	fct.Addfacility();
    	Thread.sleep(2000);
    }

    @Then("User Text on facility")
    public void user_text_on_facility() throws InterruptedException {
    	fct.txtfac();
    	Thread.sleep(2000);
    }

    @Then("User click on creats")
    public void user_click_on_creats() throws InterruptedException {
    	fct.crtgp();
    	Thread.sleep(2000);
    }

    
//Settings Casetype
    
    
    @Given("User click on the setting")
    public void user_click_on_the_setting() throws InterruptedException {
    	cas=new SettingcasetypePage(driver);
    	cas.settings();
    	Thread.sleep(2000);
    	
    	
    }
    @When("User click on casetype")
    public void user_click_on_casetype() throws InterruptedException {
    	cas.casetype();
    	Thread.sleep(2000);
    }

    @Then("User click on Add casetype")
    public void user_click_on_add_casetype() throws InterruptedException {
    	cas.Addcase();
    	Thread.sleep(2000);
    }

    @Then("User Text on casetype")
    public void user_text_on_casetype() throws InterruptedException {
    	cas.txtcase();
    	Thread.sleep(2000);
    }

    @Then("User Text on casetype label")
    public void user_text_on_casetype_label() throws InterruptedException {
    	cas.txtlab();
    	Thread.sleep(2000);
    }

    @Then("User click on creat")
    public void user_click_on_creat() throws InterruptedException {
    	cas.crtcase();
    	Thread.sleep(2000);
    }

    
// Settings channel
    
    @Given("User click on seting")
    public void user_click_on_seting() throws InterruptedException {
    	chl=new SettingchannelPage(driver);
    	chl.settin();
    	Thread.sleep(2000);
    }
    	
    @When("User click on channel")
    public void user_click_on_channel() throws InterruptedException {
    	chl.channel();
    	Thread.sleep(2000);
    }

    @Then("User click on Add channel")
    public void user_click_on_add_channel() throws InterruptedException {
    	chl.Addchannel();
    	Thread.sleep(2000);
    }

    @Then("User Text on channel")
    public void user_text_on_channel() throws InterruptedException {
    	chl.txtchl("Test");
    	Thread.sleep(2000);
    }

    @Then("User click on create bnt")
    public void user_click_on_create_bnt() throws InterruptedException {
    	chl.crtchl();
    	Thread.sleep(2000);
    }

    
 //Setting department
    
    @Given("User click the setting")
    public void user_click_the_setting() throws InterruptedException {
    	dep=new SettingdepartmentPage(driver);
    	dep.settin();
    	Thread.sleep(2000);
    
    }
    
    @When("User click on department")
    public void user_click_on_department() throws InterruptedException {
    	dep.dep();
    	Thread.sleep(2000);
    }

    @Then("User click on Add department")
    public void user_click_on_add_department() throws InterruptedException {
    	dep.Adddep();
    	Thread.sleep(2000);
    }

    @Then("User select the facility")
    public void user_select_the_facility() throws InterruptedException {
    	dep.txtfac();
    	Thread.sleep(2000);
    }

    @Then("User Text on department")
    public void user_text_on_department() throws InterruptedException {
    	dep.txtdep();
    	Thread.sleep(2000);
    }

    @Then("User click on create buttonn")
    public void user_click_on_create_buttonn() throws InterruptedException {
    	dep.crtgp();
    	Thread.sleep(2000);
    }
    
    
//call reason 
    
    
    @Given("User click sitting")
    public void user_click_sitting() throws InterruptedException {
    	call=new SettingcallreasonPage(driver);
    	call.setcall();
    	Thread.sleep(2000);
    }

    @When("User click on call reason")
    public void user_click_on_call_reason() throws InterruptedException {
    	call.callr();
    	Thread.sleep(2000);
    }

    @Then("User click on Add call reason")
    public void user_click_on_add_call_reason() throws InterruptedException {
    	call.Addcall();
    	Thread.sleep(2000);
    }

    @Then("User text on call reason")
    public void user_text_on_call_reason() throws InterruptedException {
    	call.txtcall();
    	Thread.sleep(2000);
    }
    
    @Then("User click on submit buton")
    public void user_click_on_submit_buton() throws InterruptedException {
    	call.crtcall();
    	Thread.sleep(2000);
    }
    
//complaint 
    
    
    @Given("User click sitting complaint")
    public void user_click_sitting_complaint() throws InterruptedException {
    	Cmplt=new SettingcomplaintPage(driver);
    	Cmplt.setcom();
    	Thread.sleep(2000);
    }

    @When("User click on complaint")
    public void user_click_on_complaint() throws InterruptedException {
    	Cmplt.complt();
    	Thread.sleep(2000);
    }

    @Then("User click on Add complaint")
    public void user_click_on_add_complaint() throws InterruptedException {
    	Cmplt.Addcmplt();
    	Thread.sleep(2000);
    }

    @Then("User text on complaint")
    public void user_text_on_complaint() throws InterruptedException {
    	Cmplt.txtcmplt();
    	Thread.sleep(2000);
    }

    @Then("User click on submit buttons")
    public void user_click_on_submit_buttons() throws InterruptedException {
    	Cmplt.crtcall();
    	Thread.sleep(2000);
    }

    
// complaint sub type
    
    @Given("User click sitting complaint sub type")
    public void user_click_sitting_complaint_sub_type() throws InterruptedException {
    	subcmplt=new SettingsubcomplaintPage(driver);
    	subcmplt.setcomsub();
    	Thread.sleep(2000);
    }

    @When("User click on complaint sub")
    public void user_click_on_complaint_sub() throws InterruptedException {
    	subcmplt.compltsub();
    	Thread.sleep(2000);
    }
    
    @Then("User click on Add complaint button")
    public void user_click_on_add_complaint_button() throws InterruptedException {
    	subcmplt.Addcmpltsub();
    	Thread.sleep(2000);
    }

    @Then("User select on complaints")
    public void user_select_on_complaints() throws InterruptedException {
    	subcmplt.setcmplt();
    	Thread.sleep(2000);
    }

    @Then("User text on complaint sub type")
    public void user_text_on_complaint_sub_type() throws InterruptedException {
    	subcmplt.txtcmplt();
    	Thread.sleep(2000);
    }

    @Then("User click on submit")
    public void user_click_on_submit() throws InterruptedException {
    	subcmplt.crtsub();
    	Thread.sleep(2000);
    }


    
//Logout functionality
    
    @Given("User click on profile")
    public void user_click_on_profile() throws InterruptedException {
    	Lg=new LogoutPage(driver);
    	Lg.profile();
    	Thread.sleep(2000);
    	
    }

    @Then("User click on Logout button")
    public void user_click_on_logout_button() throws InterruptedException {
    	Lg.logout();
    	Thread.sleep(2000);
    	
    	
}
}
