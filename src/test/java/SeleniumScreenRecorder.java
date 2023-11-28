        import com.github.sarxos.webcam.Webcam;
		import com.github.sarxos.webcam.WebcamPanel;
		import com.github.sarxos.webcam.WebcamResolution;
		import org.openqa.selenium.chrome.ChromeDriver;

		import javax.swing.*;
		import java.awt.*;
		import java.io.IOException;

		public class SeleniumScreenRecorder {
		    public static void main(String[] args) throws IOException {
		        // Start screen recording
		        RecorderThread recorderThread = new RecorderThread();
		        Thread thread = new Thread(recorderThread);
		        thread.start();

		        // Start Selenium script
		        ChromeDriver driver = new ChromeDriver();

		        // Your Selenium script here
		        driver.get("https://facebook.com/");
		        // Perform actions...

		        // Stop screen recording
		        recorderThread.stopRecording();
		        thread.interrupt();

		        driver.quit();
		    }
		}

		class RecorderThread implements Runnable {
		    private volatile boolean isRecording = true;

		    @Override
		    public void run() {
		        Webcam webcam = Webcam.getDefault();
		        webcam.setViewSize(WebcamResolution.VGA.getSize());

		        JFrame frame = new JFrame();
		        frame.setLayout(new BorderLayout());
		        frame.setSize(WebcamResolution.VGA.getSize());

		        WebcamPanel panel = new WebcamPanel(webcam);
		        frame.add(panel, BorderLayout.CENTER);
		        frame.pack();
		        frame.setVisible(true);

		        try {
		            while (isRecording) {
		                // Record frames or perform other recording actions
		            }
		        } finally {
		            webcam.close();
		            frame.dispose();
		        }
		    }

		    public void stopRecording() {
		        isRecording = false;
		    }
		


	}


