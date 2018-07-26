import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * credated by Lugaskova Kate
 */
public class CheckResultOfSearch {

    protected WebDriver driver;
    @FindBy(
            css = "div.search-results__exception-message:nth-child(5)"
    )
    WebElement resultOfSearch;

    public CheckResultOfSearch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CheckFoundResult(){
        Assert.assertTrue(resultOfSearch.isDisplayed());
    }

}
