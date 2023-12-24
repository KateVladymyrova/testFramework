import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class LoginPage extends BasePage {
    private By logLocator = By.className("header-logo");
    private By loginFieldLocator = By.id("login_field");
    private By passwordFieldLocator = By.id("password");
    private By signInButtonLocator = By.xpath("//input[@value=\"Sign in\"]");
    private By errorTextLocator = By.xpath("//div[contains(text(),\"Incorrect username or password.\")]");
    private final static String TITLE = "Login page";

    public LoginPage(WebDriver driver) {

        super(driver, TITLE);
    }

    public WebElement getLogo() {
        return driver.findElement(logLocator);
    }

    public MainPage loginSuccessful(String login, String password) {
        Logger logger = LogManager.getLogger();
        logger.info("Authorization has started");
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
        logger.info("Successful authorization");
        printColorMessage("Successful authorization", logger, Level.INFO);
        return new MainPage(driver);
    }

    public LoginPage loginFailed(String login, String password) {
        Logger logger = LogManager.getLogger();
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
        logger.info("Failed Login");
        printColorMessage("Failed Login", logger, Level.INFO);
        return this;
    }

    public LoginPage validateErrorMessage(String expectedMessage) {
        Assertions.assertEquals(expectedMessage, driver.findElement(errorTextLocator).getText());
        return this;
    }
}
