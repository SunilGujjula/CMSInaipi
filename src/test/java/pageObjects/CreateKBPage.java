package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateKBPage {
	
public WebDriver ldriver;
	
    public CreateKBPage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //KB
    @FindBy(xpath="(//span[normalize-space()='school'])[1]")
    @CacheLookup
    WebElement KB;
    
    //create KB
    @FindBy(xpath="(//p[normalize-space()='Create Knowledge Base'])")
    @CacheLookup
    WebElement crtKB;
    
  //create KBase
    @FindBy(xpath="(//span[normalize-space()='add'])")
    @CacheLookup
    WebElement createKB;
    
  //KBase title
    @FindBy(xpath="(//input[@name='title'])[1]")
    @CacheLookup
    WebElement KBtitle;
    
    //KBase category
    @FindBy(xpath="//div[@class=\"mat-mdc-select-arrow ng-tns-c3539745940-19\"]")
    @CacheLookup
    WebElement KBcat;
    
  //KBase group
    @FindBy(xpath="(//span[normalize-space()='test 13'])[2]")
    @CacheLookup
    WebElement KBgrp;

   	//KBase description
     @FindBy(xpath="(//body[@id='tinymce'])[1]")
     @CacheLookup
     WebElement KBdec;
     
 	//KBase create
     @FindBy(xpath="(//button[normalize-space()='Create'])[1]")
     @CacheLookup
     WebElement KBcreate;

// Action methods

	public void KB() {
		KB.click();
		
	}

	public void crtKB() {
		crtKB.click();
		
	}

	public void createKB() {
		createKB.click();
	}

	public void KBtitle(String test) {
		KBtitle.sendKeys("Test");
	}

	public void KBcat() {
		KBcat.click();
	}

	public void KBgrp() {
		KBgrp.click();
	}

	public void KBdec(String string) {
		KBdec.sendKeys("Test for testing");
	}

	public void KBcreate() {
		KBcreate.click();
	}
    
    

}
