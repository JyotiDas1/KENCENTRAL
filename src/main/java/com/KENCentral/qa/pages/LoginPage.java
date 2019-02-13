package com.KENCentral.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.KENCentral.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="signInName") 
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='next']")
	WebElement Signin;


	//Intilizing the Page Object
	public LoginPage() {
		
		PageFactory.initElements(driver,this); //this :- all the variable(username,p/w,loginbtn,) itilized to driver using this keyword
		
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		
		return driver.getTitle();

	}
	public String getcurrentURL() {
		return driver.getCurrentUrl();
	}

	
    public HomePage login(String un,String pwd) {
    	
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	Signin.click();
  
    	return new HomePage(); 
    
    }

}