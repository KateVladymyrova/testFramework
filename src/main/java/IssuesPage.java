import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class IssuesPage extends BasePage {
    private By issuesLogLocator = By.xpath("//span [@class=\"AppHeader-context-item-label  \"]");
    private By createButtonLocator = By.xpath("//button[@id=\"global-create-menu-button\"]");
    private final static String TITLE = "Issues page";

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement fiendIssuesLogLocator() {
        return driver.findElement(issuesLogLocator);
    }

    public NewRepository goToCreateMenuButton() {
        webDriverWait.until(elementToBeClickable(driver.findElement(createButtonLocator)));
        driver.findElement(createButtonLocator).click();
        return new NewRepository(driver);
    }
}
