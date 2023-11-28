import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		//driver.manage().getCookieNamed(cookieName);
		// Returns a list of all Cookies
		
//		Cookie cname = new Cookie("Prabhakar", "Ram");
//		driver.manage().addCookie(cname);
        
		
		driver.manage().deleteAllCookies();
		 Set<Cookie> st2=driver.manage().getCookies();
			
			System.out.println(st2);
			
		
		driver.quit();

	}

}
