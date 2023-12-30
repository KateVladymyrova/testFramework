import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class GitHubTest extends BaseTest {

    @Test
    public void validateLogoOnTheLoginPageIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().getLogo().isDisplayed());
    }

    @Test
    public void validateAnUserCanLoginSuccessfully() {
        HomePage homePage = new HomePage(driver);
        assertEquals("Home", homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
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
        assertTrue(homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                "work46341@gmail.com").goToIssuesPage().getIssuesLogLocator().isDisplayed());
    }

    @Test
    public void validateLogoOnTheNewRepositoryIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                        "work46341@gmail.com").goToIssuesPage().goToCreateNew().goToNewRepository().
                getNewReLogLocator().isDisplayed());
    }

    @Test
    public void validateRepositoriesList() {
        HomePage homePage = new HomePage(driver);
        List<String> actualRepositoriesList = homePage.goToLoginPage().loginSuccessful("work46341@gmail.com",
                        "work46341@gmail.com").goToIssuesPage().goToProfileForm().goToRepositoriesPage().
                getRepositoriesNames();
        List<String> expectedRepositoriesList = new ArrayList<>();
        expectedRepositoriesList.add("Test");
        expectedRepositoriesList.add("Test1");
        expectedRepositoriesList.add("Test2");
        assertEquals(expectedRepositoriesList, actualRepositoriesList,
                "Actual repositories are not equal to expected");
    }

    @DataProvider(name = "dataProvider")
    public Object[][] credentialProvider() {
        return new Object[][]{
                {"Test"},
                {"Test1"},
                {"Test2"}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void validateRepositoriesListParametrized(String repositoryName) {
        HomePage homePage = new HomePage(driver);
        List<String> repositoriesList = homePage
                .goToLoginPage()
                .loginSuccessful("work46341@gmail.com",
                        "work46341@gmail.com")
                .goToIssuesPage()
                .goToProfileForm()
                .goToRepositoriesPage()
                .getRepositoriesNames();
        assertTrue(repositoriesList.contains(repositoryName));
    }
}
