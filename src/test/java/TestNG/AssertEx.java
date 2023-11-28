package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	
	
  @Test
  public void f() {
	  
	  
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://facebook.com/");
	  
	 String title=driver.getTitle();
	 String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	 Assert.assertEquals(ExpectedTitle, title);
	 
	 driver.quit();
  }
}
