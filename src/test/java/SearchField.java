import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * credated by Lugaskova Kate
 */
public class SearchField {

    private WebDriver driver;

    public SearchField(WebDriver driver) { this.driver = driver; }

    public void enterValueForSearch() {
        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
        searchField.sendKeys("Testttttttt");
    }
}
