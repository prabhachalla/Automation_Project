import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
	
		
		Thread.sleep(5000);
		driver.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
		String message1=driver.switchTo().alert().getText();
		System.out.println(message1);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.quit();		
		
		

	}

}
