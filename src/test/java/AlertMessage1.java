import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		 Thread.sleep(5000); 
		 driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("79923795");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
	    driver.findElement(By.xpath("//input[@id='keyboard']")).sendKeys("Prasvh@0458");
		
		driver.findElement(By.xpath("//a[@id='loginBtn']")).click();
		
		String actualMsg=driver.findElement(By.xpath("//p[@class='error-msg ng-binding ng-scope']")).getText();
		String errorMsg= "* Customer ID/IPIN (Password) is invalid. Please try again";
		
		if(actualMsg.equals(errorMsg)) {
		    System.out.println("Test Case Passed");
		}else{
		    System.out.println("Test Case Failed");
		};
		Thread.sleep(5000);
		driver.quit();
		
		

	}



}
