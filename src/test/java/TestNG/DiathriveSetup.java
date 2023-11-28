package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import diathrive.DiathriveHomepage;
import diathrive.DiathriveLoginPage;
import diathrive.DiathriveSignUpPage;

public class DiathriveSetup {
	WebDriver driver;
	DiathriveSignUpPage objDiathriveSignUpPage;
	DiathriveHomepage objDiathriveHomepage;
	
	
	
	DiathriveLoginPage objDiathriveLoginPage;
	
	
	@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://web-staging.diathrive.com/");
	driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
		
	
	}
	
	@Test(priority = 2)
	public void enter_userDetails() throws InterruptedException {
//		objDiathriveSignUpPage  = new DiathriveSignUpPage(driver);
//		
//		objDiathriveSignUpPage.enterFullName("prabhakar123");
//		objDiathriveSignUpPage.enterPasswrod("TestUser@gmail.com");
//		objDiathriveSignUpPage.clickOncontinue(null);
		
		objDiathriveLoginPage=new DiathriveLoginPage(driver);
		
		objDiathriveLoginPage.enterEmail("neha.kedia@technoidentity.com");
		
		objDiathriveLoginPage.enterPassword("Test@12345");
		objDiathriveLoginPage.clickNextButton();
		Thread.sleep(5000);
		objDiathriveLoginPage.clickSignout();
		Thread.sleep(2000);
		objDiathriveLoginPage.signout();
		
	}
	@AfterClass
	public void  quit() {
		
		driver.close();
	}
	
	
}



