package kaopiz.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kaopiz.actions.commons.BaseSetup;
import kaopiz.actions.pageObjects.DashboardPage;
import kaopiz.actions.pageObjects.LoginPage;

public class Exam2 extends BaseSetup {
	
	private WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeTest
	public void beforeTest() {
		driver = getDriver();
	}
	
	 @Test(priority = 2)
	    public void testLoginSuccess() {
		 	LoginPage loginPage = new LoginPage(driver);
		 	
	        loginPage.navigateToLoginPage();
	        
	        loginPage.login();
	        
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        
	        //verify DashboardTitle
	        Assert.assertTrue(dashboardPage.verifyDashboardTitle());
	       
	 }
	 
	 @Test(priority = 1)
	    public void testPlaceholder(){
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.navigateToLoginPage();

	        WebElement rememberMeCheckbox = loginPage.getRememberMeCheckbox();
	        loginPage.clickRememberMeCheckbox(rememberMeCheckbox);
	        
	        //verify checkBox isSelected
	        Assert.assertTrue(rememberMeCheckbox.isSelected(), "Remember Me checkbox was not selected!");
	        
	        //verifyPlaceholder
	        loginPage.verifyPlaceholder();
	    }
	 
	 @AfterTest
		public void afterTest() throws InterruptedException {
		 Thread.sleep(2000);
			driver.quit();
		}
	
}
   
