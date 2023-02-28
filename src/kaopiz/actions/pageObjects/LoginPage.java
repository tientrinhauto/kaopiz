package kaopiz.actions.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;
    
    private String urlLogin = "https://phptravels.net/admin";
    private By emailLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By loginButtonLocator = By.tagName("button");
    private By rememberCheckBox = By.xpath("//input[@type='checkbox']");
    
    private String email = "admin@phptravels.com";
    private String password = "demoadmin";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get(urlLogin);
    }

    public void login() {
    	 WebElement emailField = driver.findElement(emailLocator);
         WebElement passwordField = driver.findElement(passwordLocator);
        
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public WebElement getRememberMeCheckbox() {
        return driver.findElement(rememberCheckBox);
    }
    
    public void clickRememberMeCheckbox(WebElement elementCheckBox) {
    	Actions actions = new Actions(driver);
        actions.moveToElement(elementCheckBox).click().build().perform();
    }
    
    public void verifyPlaceholder () {
    	WebElement emailField = driver.findElement(emailLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        
    	Assert.assertEquals(emailField.getAttribute("placeholder"),"Email", "Email placeholder is incorrect!");
        Assert.assertEquals(passwordField.getAttribute("placeholder"),"Password","Password placeholder is incorrect!");
    }
}
