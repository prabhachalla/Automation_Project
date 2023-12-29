package diathrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiathriveSignUpPage {
	
	
	WebDriver driver;
	
	By Username=By.xpath("//input[@type='email']");
	By Password=By.xpath("//input[@type='password']");
	By Continue=By.xpath("//div[@class='css-1rynq56 r-1mgje8r r-ubezar r-135wba7 r-1r5su4o']");
	
	
	public DiathriveSignUpPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public void enterFullName(String arg1) {
		driver.findElement(Username).sendKeys(arg1);
		}
	public void enterPasswrod(String arg1) {
		driver.findElement(Password).sendKeys(arg1);
		}
	
	public void clickOncontinue(String arg1) {
		driver.findElement(Continue).click();
		}
}
