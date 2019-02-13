package com.KENCentral.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.KENCentral.qa.base.TestBase;
import com.KENCentral.qa.pages.HomePage;
import com.KENCentral.qa.pages.LoginPage;
import com.KENCentral.qa.pages.UserPage;
import com.KENCentral.qa.util.TestUtil;

public class UserPageTest extends TestBase{

	LoginPage loginobj;
	HomePage homeobj;
    UserPage userpage;
	TestUtil testutil;
	
	public UserPageTest() {
		super();
	}
	
	 @BeforeMethod
	    public void setup() {
	    	initialization();
	    	testutil=new TestUtil();
	    	loginobj=new LoginPage();
	    	homeobj=new HomePage();
	    	homeobj=loginobj.login(prop.getProperty("username"), prop.getProperty("password"));
	    	userpage=homeobj.ClickonUserlink();
	    	userpage.clickonallUser();
	    	
	    //	driver.get("https://kencloudecosysadmin.azurewebsites.net/UserManagement/UserListView/Index#");
	    	
	        System.out.println("Clicked on All Users SubLink");
	 }
	 @Test(priority=8)
	 public void getcurrentUserPageUrl() {
		
		 System.out.println(userpage.getcurrentUserPageURL());
	 }
	 
	 @Test(priority=9)
	 public void clickonaddUser() throws InterruptedException{
         userpage.clickonaddUser();		
  		 System.out.println("Clicked on add User Link");
  		 userpage.AddNewUser();
  		 System.out.println(userpage.validatepasswordheader());
  		 userpage.password();
  		 System.out.println(userpage.validatecontactheader());
  		 userpage.entermobile();
  		 userpage.entercity();
  		 userpage.selectstate();
  		 userpage.selectOptionWithText("textToSelect");
  		 userpage.selectcountry();
  		 userpage.selectOptionWithTextI("textToSelect");
	 }
	 

	@AfterMethod
	public void teardown() {
	//	driver.quit();
		
	}
	
	 
}
