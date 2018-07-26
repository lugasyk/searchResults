import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * credated by Lugaskova Kate
 */
public class PositiveResultOfSearch {


    protected WebDriver driver;
    @FindBy(
            css = "article.search-results__item:nth-child(1)"
    )
    WebElement resultOfSearch;

    public PositiveResultOfSearch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CheckFoundPositiveResult(){
        Assert.assertTrue(resultOfSearch.isDisplayed());
    }
}
