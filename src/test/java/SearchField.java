import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * credated by Lugaskova Kate
 */
public class SearchField {

    protected WebDriver driver;
    @FindBy(
            css = ".header-search__input"
    )
    private WebElement searchField;


    public SearchField(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterValueForSearch(String query) {
        searchField.sendKeys(query);
    }
}
