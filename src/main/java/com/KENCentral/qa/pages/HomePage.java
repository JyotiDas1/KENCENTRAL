package com.KENCentral.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.KENCentral.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement leftMenulbl;
	
	@FindBy(xpath="//h5[contains(text(),'Environment Setup')]")
	WebElement homepageheader;

   // @FindBy(xpath="//span[@class='k-link k-header'][contains(text(),'Users')]")
    
    @FindBy(css="div.row.float-left.bdleft-pan.k-content.custom_scroll:nth-child(4) div.k-content ul.k-widget.k-panelbar.k-reset.k-header:nth-child(1) li.k-item.k-state-default:nth-child(2) > span.k-link.k-header")
    WebElement usermenulbl;
	
//	@FindBy(xpath="//div[@id='sid_nav_inner']//li[2]//li[2][contains(text(),'Users')]")
  
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//To get current URL
	public String getcurrentURL() {
		return driver.getCurrentUrl();
	}
	//To check the title of HOME PAGE
	public String validateHomePagetitle() {
		
		return driver.getTitle();
	}
	//To check the left menu
    public String validateleftMenu() {
		//return leftMenulbl.isDisplayed();
		return leftMenulbl.getText();        	
    }
    
    //Check the Environment Setup header present in the homepage
    public String validateheader() {
		return homepageheader.getText();
        	
    }
    public UserPage ClickonUserlink() {
		
		 usermenulbl.click();
		 return new UserPage();
	}
    //To check the Navigation bar
    /*public void navigationbar(){
    	
    	
    }*/
}
