import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class IssuesPage extends BasePage {
    private By issuesLogLocator = By.xpath("//span [@class=\"AppHeader-context-item-label  \"]");
    private By createButtonLocator = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[2]/action-menu/focus-group/button/span");

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getIssuesLogLocator() {
        return driver.findElement(issuesLogLocator);
    }

    public NewRepository goToCreateNew() {
        webDriverWait.until(elementToBeClickable(driver.findElement(createButtonLocator)));
        driver.findElement(createButtonLocator).click();
        return new NewRepository(driver);
    }
}
