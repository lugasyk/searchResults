
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchTestsInvalidValue extends TestBase {

    @Test
    public void navigateToEpamWebSiteSearchAndCheckresult() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSearchIcon();

        SearchField searchField = new SearchField(driver);
        searchField.enterValueForSearch("testttttt");

        ClickFindButton clickFindButton = new ClickFindButton(driver);
        clickFindButton.ClickFindButtonForSearch();

        CheckResultOfSearch checkResultOfSearch = new CheckResultOfSearch(driver);
        checkResultOfSearch.CheckFoundResult();

        HomePage homePage2 = new HomePage(driver);
        homePage2.clickOnSearchIcon();

        SearchField searchFieldPositive = new SearchField(driver);
        searchFieldPositive.enterValueForSearch("Dobkin");

        ClickFindButton clickFindButton2 = new ClickFindButton(driver);
        clickFindButton2.ClickFindButtonForSearch();

        PositiveResultOfSearch positiveResultOfSearch = new PositiveResultOfSearch(driver);
        positiveResultOfSearch.CheckFoundPositiveResult();


    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }


}



