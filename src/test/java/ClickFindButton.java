import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * credated by Lugaskova Kate
 */
public class ClickFindButton {

    protected WebDriver driver;
    @FindBy(
            css = ".header-search__submit"
    )
     WebElement findButton;


    public ClickFindButton(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickFindButtonForSearch() {
        findButton.click();
    }
}
