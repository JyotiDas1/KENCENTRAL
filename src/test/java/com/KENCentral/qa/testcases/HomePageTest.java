package com.KENCentral.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.KENCentral.qa.base.TestBase;
import com.KENCentral.qa.pages.HomePage;
import com.KENCentral.qa.pages.LoginPage;
import com.KENCentral.qa.pages.UserPage;
import com.KENCentral.qa.util.TestUtil;


public class HomePageTest extends TestBase {

	
	LoginPage loginobj;
	HomePage homeobj;
	UserPage userpage;
    TestUtil testutil;
    
    public HomePageTest() {
    	
    	super();
    }
    
    
    @BeforeMethod
    public HomePage setup() {
    	initialization();
    	testutil=new TestUtil();
    	userpage=new UserPage();
    	loginobj=new LoginPage();
    	homeobj=loginobj.login(prop.getProperty("username"), prop.getProperty("password"));
    	return homeobj;
    }
  
    @Test(priority=1)
    public void validateHomePagetitle() throws InterruptedException {
        Thread.sleep(20000);
    	String HomePagetitle=homeobj.validateHomePagetitle();
    	Assert.assertEquals(HomePagetitle, "Index - My Telerik MVC Application");
    	System.out.println(HomePagetitle);
    }
    @Test(priority=2)
    public void getcurrentURL() throws InterruptedException {
    	Thread.sleep(10000);
    	System.out.println(homeobj.getcurrentURL());
    }
    @Test(priority=3)
    public void validateleftMenu() {
    	//Assert.assertTrue(homeobj.validateleftMenu());
    	System.out.println(homeobj.validateleftMenu());
    }
    @Test(priority=4)
    public void validateheader() {
    	
    	System.out.println(homeobj.validateheader());
    }
    
    @Test(priority=5)
    public void ClickonUserlink() {
    	userpage=homeobj.ClickonUserlink();
    	System.out.println("clicked on user link");
    	
    }
    
    
    @AfterMethod 
    public void tearDown() {
    	driver.quit();
    }
}
