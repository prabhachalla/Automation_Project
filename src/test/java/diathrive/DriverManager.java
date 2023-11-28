package diathrive;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DriverManager {

	    private static WebDriver driver;

	    private DriverManager() {
	        // Private constructor to prevent instantiation
	    }

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            // Initialize WebDriver
	            driver = new ChromeDriver();
	        }
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;  // Set to null to indicate that the driver has been quit
	        }
	    }
	}


