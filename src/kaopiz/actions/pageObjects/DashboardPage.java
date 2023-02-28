package kaopiz.actions.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getTitleDashboardPage() {
    	return driver.getTitle();
    }

    public boolean verifyDashboardTitle() {
    	 WebDriverWait wait = new WebDriverWait(driver, 5);
	     return wait.until(ExpectedConditions.titleIs("Dashboard"));
        
    }
}
