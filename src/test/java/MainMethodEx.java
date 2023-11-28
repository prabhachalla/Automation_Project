
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ScreenRecorderUtil.startRecord("main");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		ScreenRecorderUtil.stopRecord();

	}

}
