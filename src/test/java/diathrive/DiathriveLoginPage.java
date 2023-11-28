package diathrive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiathriveLoginPage {

    private WebDriver driver;
    
    public  DiathriveLoginPage(WebDriver driver) {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    }

    // Using @FindBy to locate elements on the page
    @FindBy(xpath ="//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath   ="//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath ="//div[@class='css-1rynq56 r-1mgje8r r-ubezar r-135wba7 r-1r5su4o']")
    private WebElement nextButton;
    
    
    @FindBy(xpath = "//div[@class='css-1rynq56 r-1mgje8r r-ubezar'][normalize-space()='Sign-out']")
    private WebElement clickSignout;
    @FindBy(xpath = "//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1867qdf r-18u37iz r-1awozwy r-1777fci']")
    private WebElement signout1;
    
    

    // Constructor to initialize the driver and instantiate elements using PageFactory
    

    
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickNextButton() {
        nextButton.click();
    }
    
    public void clickSignout() {
    	clickSignout.click();
    	
    }
    
    public void signout() {
    	signout1.click();
    }
}



