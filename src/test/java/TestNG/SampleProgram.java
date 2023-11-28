package TestNG;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleProgram {

@Test
  public void Test() throws InterruptedException {	
	
	
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://facebook.com");
       Thread.sleep(5000);
       driver.close();
       
	     }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("Aftermethod");
  }
 
  }
  
  

