package diathrive;
	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {

	private WebDriver driver;

	    
	    
	    @FindBy(xpath = "//div[@class='css-1rynq56 r-1mgje8r r-ubezar'][normalize-space()='Sign-out']")
	    private WebElement clickSignout;
	    @FindBy(xpath = "//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1867qdf r-18u37iz r-1awozwy r-1777fci']")
	    private WebElement signout1;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    public  void logout() {
	    	
	    	clickSignout.click();
	    	signout1.click();
	    }
	}


