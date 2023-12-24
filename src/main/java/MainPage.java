import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends BasePage {
    private By headerLocator = By.xpath("//h3[text()=\"Home\"]");
    private By issuesButtonLocator = By.xpath("//div[contains(@class, \"AppHeader-actions\")]/a[1]");
    private final static String TITLE = "Main page";

    public MainPage(WebDriver driver) {

        super(driver, TITLE);
    }

    public WebElement getHeaderLocator() {
        return driver.findElement(headerLocator);
    }

    public IssuesPage goToIssuesPage() {
        webDriverWait.until(elementToBeClickable(driver.findElement(issuesButtonLocator)));
        driver.findElement(issuesButtonLocator).click();
        return new IssuesPage(driver);
    }
}
