import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * credated by Lugaskova Kate
 */
public class SearchTestValidValue extends TestBase{

    @Test
    public void navigateToEpamWebSiteSearchValidValueAndCheckResult(){
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
