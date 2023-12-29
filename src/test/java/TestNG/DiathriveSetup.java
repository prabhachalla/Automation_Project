package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import diathrive.DiathriveHomepage;
import diathrive.DiathriveLoginPage;
import diathrive.DiathriveSignUpPage;
import diathrive.Homepagecheck;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Epic: Selenium Tests")
@Feature("Feature: Allure Reporting")
public class DiathriveSetup {
	WebDriver driver;
	DiathriveSignUpPage objDiathriveSignUpPage;
	DiathriveHomepage objDiathriveHomepage;
	DiathriveLoginPage objDiathriveLoginPage;
	Homepagecheck objHomepagecheck;
	
	
	
	@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://web-staging.diathrive.com/");
	driver.manage().window().maximize();
	}
	
	@Description("Verify the Home page functionality")
    @Story("Story: Home Page")
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
		
	
	}
	
	@Description("Verify the login functionality")
    @Story("Story: Login")
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
	
	@Description("Verify the home functionality")
    @Story("Story: Home")
	@Test(priority = 3)
	
	public void checkManualInputfield() throws InterruptedException {
		
        objDiathriveLoginPage=new DiathriveLoginPage(driver);
		
		objDiathriveLoginPage.enterEmail("neha.kedia@technoidentity.com");
		
		objDiathriveLoginPage.enterPassword("Test@12345");
		objDiathriveLoginPage.clickNextButton();
		Thread.sleep(5000);
		objHomepagecheck=new Homepagecheck(driver);
		
		objHomepagecheck.CheckManualInput();
		Thread.sleep(5000);
		
	}
	
	
	
	@AfterMethod
    public void tearDown(ITestResult result) {
        // Additional logic after the test execution
        // ...

        // Send email report
        String recipientEmail = "selenium-test-automation@googlegroups.com";
        String subject = "Test Results";
        String body = "Your test results: " + (result.isSuccess() ? "Passed" : "Failed");
        String attachmentPath = "D:\\Selenium_Automation\\Automation_Project\\test-output\\emailable-report.html";

        EmailUtility.sendEmail(recipientEmail, subject, body, attachmentPath);
	
	
	}
	
	
	
	@AfterClass
	public void  quit() {
		
		driver.close();
	}
	
	
}



