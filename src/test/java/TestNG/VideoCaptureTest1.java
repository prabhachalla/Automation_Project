package TestNG;

import org.testng.annotations.Test;
 
	
	import org.monte.media.Format;
	import org.monte.media.FormatKeys;
	import org.monte.media.Registry;
	import org.monte.screenrecorder.ScreenRecorder;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import java.awt.*;
	import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
	import java.util.Date;

	public class VideoCaptureTest1 {
	    private ScreenRecorder screenRecorder;
	    private WebDriver driver;

	    @BeforeMethod
	    public void setUp() throws Exception {
	        // Set up the screen recorder
	        screenRecorder = new SpecializedScreenRecorder(
	                GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(),
	                new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
	                new Format(MediaTypeKey, FormatKeys.MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, (int) 24, FrameRateKey,
	                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, (int) (15 * 60)),
	                new Format(MediaTypeKey, FormatKeys.MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
	                null);

	        // Set up the WebDriver (in this example, Chrome)
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	       ChromeDriver driver = new ChromeDriver();
	    }

	    @Test
	    public void testCaptureVideoOnFailure() {
	        // Your test logic here
	        driver.get("https://example.com");
	        // ...

	        // Simulate a test failure for demonstration purposes
	        assert false;
	    }

	    @AfterMethod
	    public void tearDown(ITestResult result) throws Exception {
	        // Close the WebDriver
	        if (driver != null) {
	            driver.quit();
	        }

	        // If the test failed, capture the last 15 seconds of the video
	        if (result.getStatus() == ITestResult.FAILURE && screenRecorder != null) {
	            screenRecorder.stop();
	        }
	    }

	    private class SpecializedScreenRecorder extends ScreenRecorder {
	        public SpecializedScreenRecorder(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
	                                         Format screenFormat, Format mouseFormat, Format audioFormat)
	                throws AWTException, IOException {
	            super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat);
	        }

	       

			@Override
	        protected File createMovieFile(Format fileFormat) {
	            // Create a unique filename based on the test method name and timestamp
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
	            String fileName = "video-" + dateFormat.format(new Date()) + "." +
	                    Registry.getInstance().getExtension(fileFormat);
	            return new File(fileName);
	        }
	    }
	}


