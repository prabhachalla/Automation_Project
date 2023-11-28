
		import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

		public class SeleniumScreenRecorder1 {

		    public static void main(String[] args) throws IOException, InterruptedException {
		        startScreenRecording();

		        // Run your Selenium script
		        runSeleniumScript();

		        stopScreenRecording();
		    }

		    private static void startScreenRecording() throws IOException, InterruptedException {
		        // Adjust the path based on your OBS Studio installation
		        String obsExePath = "C:\\Program Files\\obs-studio\\bin\\64bit\\obs64.exe";
		        String startRecordingCommand = obsExePath + " --startrecording";

		        // Start screen recording
		        Runtime.getRuntime().exec(startRecordingCommand);
		        
		        Thread.sleep(7000);
		    }

		    private static void runSeleniumScript() throws InterruptedException {
		        // Implement your Selenium script here
		        // Example:
//		        ChromeDriver driver = new ChromeDriver();
		    	ChromeOptions options = new ChromeOptions();
		    	options.addArguments("--lang=en-US");
		    	WebDriver driver = new ChromeDriver(options);
		        driver.get("https://facebook.com/");
		        
		        Thread.sleep(5000);
		        // Perform actions...
		        driver.quit();
		    }

		    private static void stopScreenRecording() throws IOException, InterruptedException {
		        // Adjust the path based on your OBS Studio installation
		        String obsExePath = "C:\\Program Files\\obs-studio\\bin\\64bit\\obs64.exe";
		        String stopRecordingCommand = obsExePath + " --stoprecording";

		        // Wait for some time to allow OBS Studio to save the recording
		        Thread.sleep(7000);

		        // Stop screen recording
		        Runtime.getRuntime().exec(stopRecordingCommand);
		    }
		

	}


