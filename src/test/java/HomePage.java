import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * credated by Lugaskova Kate
 */
public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSearchIcon(){
        WebElement searchButton = driver.findElement(By.cssSelector(".header-search__button.header__utility-button"));
        searchButton.click();
    }
}
