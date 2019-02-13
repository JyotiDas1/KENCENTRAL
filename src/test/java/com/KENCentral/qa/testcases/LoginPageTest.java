package com.KENCentral.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.KENCentral.qa.base.TestBase;
import com.KENCentral.qa.pages.HomePage;
import com.KENCentral.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	LoginPage loginobj;
	HomePage homeobj;

	 public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		
				initialization();
				
				loginobj =new LoginPage();
	
		}
	
	/*@Test(priority = 1)
	public void loginPageTitleTest() throws InterruptedException {
		String title = loginobj.validateLoginPageTitle();
		Thread.sleep(20000);
		Assert.assertEquals(title, "Login");
		System.out.println(title);
	}*/
	@Test(priority = 6)
	public void getCurrentURL() {
		String currentURL = loginobj.getcurrentURL();
		System.out.println("Current URL is"+currentURL );
	}
	
	@Test(priority = 7)
	public void loginTest() {
		homeobj = loginobj.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
