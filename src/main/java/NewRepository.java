import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class NewRepository extends BasePage {
    private By newReLogLocator = By.xpath("//span[@class=\"AppHeader-context-item-label  \"]");
    private By newRepositoryButtonLocator = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[2]/action-menu/focus-group/anchored-position/div/div/div/ul/li[1]/a/span[2]");
    private final static String TITLE = "New Repository page";

    public NewRepository(WebDriver driver) {

        super(driver, TITLE);
    }

    public WebElement getNewReLogLocator() {
        return driver.findElement(newReLogLocator);
    }

    public NewRepository goToNewRepository() {
        webDriverWait.until(elementToBeClickable(driver.findElement(newRepositoryButtonLocator)));
        driver.findElement(newRepositoryButtonLocator).click();
        return new NewRepository(driver);
    }
}
