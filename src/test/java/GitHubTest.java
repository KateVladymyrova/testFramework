import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GitHubTest extends BaseTest {
//    Logger logger;

    @Test
    public void validateLogoOnTheLoginPageIsDisplayed() {
        Logger logger = LogManager.getLogger();
        logger.info("validateLogoOnTheLoginPageIsDisplayed starts");
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().getLogo().isDisplayed());
        logger.info("validateLogoOnTheLoginPageIsDisplayed passed successfully");
    }

    @Test
    public void validateAnUserCanLoginSuccessfully() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("Home", homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                "work46341@gmail.com").getHeaderLocator().getText());
    }

    @Test
    public void validateFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginFailed("work4634@gmail.com", "work46341@gmail.com").
                validateErrorMessage("Incorrect username or password.");
    }

    @Test
    public void validateLogoOnTheIssuesPageIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                "work46341@gmail.com").goToIssuesPage().getIssuesLogLocator().isDisplayed());
    }

    @Test
    public void validateLogoOnTheNewRepositoryIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                        "work46341@gmail.com").goToIssuesPage().goToCreateNew().goToNewRepository().
                getNewReLogLocator().isDisplayed());
    }
}
