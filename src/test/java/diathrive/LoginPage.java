package diathrive;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

	    private WebDriver driver;

	    @FindBy(xpath ="//input[@type='email']")
	    private WebElement usernameInput;

	    @FindBy(xpath   ="//input[@type='password']")
	    private WebElement passwordInput;
	    
	    @FindBy(xpath ="//div[@class='css-1rynq56 r-1mgje8r r-ubezar r-135wba7 r-1r5su4o']")
	    private WebElement loginButton;

	    

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void login(String username, String password) {
	        usernameInput.sendKeys(username);
	        passwordInput.sendKeys(password);
	        loginButton.click();
	    }
	}


