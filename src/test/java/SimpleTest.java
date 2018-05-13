import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SimpleTest {


    @Test
    public void navigateToEpamWebSiteSearchAndCheckresult() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/");

        WebElement searchButton = driver.findElement(By.cssSelector(".header-search__button.header__utility-button"));
        searchButton.click();
        WebElement searchField = driver.findElement(By.cssSelector(".header-search__input"));
        searchField.sendKeys("Testttttttt");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement findButton = driver.findElement(By.cssSelector(".header-search__submit"));
        findButton.click();
        WebElement resultMessage = driver.findElement(By.cssSelector(".div.search-results__exception-message:nth-child(5)"));
        System.out.println(resultMessage);
    }
}


