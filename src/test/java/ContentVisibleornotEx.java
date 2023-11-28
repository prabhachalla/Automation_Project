import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVisibleornotEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://agilemanifesto.org/");
		
	String st1=	driver.findElement(By.xpath("/html/body/center/p[1]/font")).getText();
	
	System.out.println("***********"+st1+"*****************");
	
	
	
	String st2=driver.findElement(By.xpath("/html/body/center/p[2]")).getText();
	System.out.println(st2);
		
		driver.quit();

	}

}
