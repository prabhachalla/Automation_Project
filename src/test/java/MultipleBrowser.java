
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleBrowser { 
public static void main(String[] args) throws Exception {

ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
// Load the website
driver.get("https://the-internet.herokuapp.com/abtest");

Thread.sleep(5000);

WebElement ST=driver.findElement(By.linkText("Elemental Selenium"));
ST.click();

Thread.sleep(5000);

String mainWindowHandle = driver.getWindowHandle();


System.out.println(driver.getTitle());

Set<String> allWindowHandles = driver.getWindowHandles();


for (String handle : allWindowHandles) {
    if (!handle.equals(mainWindowHandle)) {
        driver.switchTo().window(handle);
        // Perform actions on the new window
        // For example:
        System.out.println("Title of the new window: " + driver.getTitle());
        // Close the new window/tab
        driver.close();
        break;



        }
     }

Thread.sleep(5000);
//// Switch back to the parent window (if needed) 
driver.switchTo().window(mainWindowHandle);
//Get the number of open windows:
int numberOfWindows = allWindowHandles.size();

System.out.println(numberOfWindows);

driver.quit();
}
}
