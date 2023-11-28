import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmLearnEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[9]/div/div/div/a/div[2]")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
