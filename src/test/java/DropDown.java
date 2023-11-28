import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[@class='bstack-mm-developers-nav bstack-mm-li']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@class,'bstack-mm-link bstack-mm-dev-link-events')]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
