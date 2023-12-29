package TestNG;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import diathrive.DriverManager;
import diathrive.HomePage;
import diathrive.LoginPage;

	public class ExampleTest {

	    private WebDriver driver;
	    private LoginPage loginPage;
	    private HomePage homePage;

	    @BeforeClass
	    public void setUp() throws InterruptedException {
	        driver = DriverManager.getDriver();
	        loginPage = new LoginPage(driver);
	        homePage = new HomePage(driver);
	        driver.get("https://web-staging.diathrive.com/");
	        driver.manage().window().maximize();
	        
	        
	        
	    }

	    @Test
	    public void testLoginAndLogout() throws InterruptedException  {
	    	
	    	String expectedTitle = "Email";
	        String actualTitle = driver.findElement(By.xpath("//div[contains(text(),'Email')]")).getText();
	        System.out.println(actualTitle);
	        
	        SoftAssert sa=new SoftAssert();
	    	sa.assertEquals(expectedTitle,actualTitle );
	        loginPage.login("neha.kedia@technoidentity.com", "Test@12345");
	        // Perform assertions or actions after login
	        Thread.sleep(10000);
	        
	        // Example: Logout
	        homePage.logout();
	        Thread.sleep(10000);
	        // Perform assertions or actions after logout
	        
	        }
	    
	    @AfterClass
	    public void tearDown() {
	        DriverManager.quitDriver();
	    }
	}



