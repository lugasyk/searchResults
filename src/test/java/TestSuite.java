import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "drv/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/");
    }

    @Test
    public void navigateToEpamWebSiteSearchAndCheckresult() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSearchIcon();

        SearchField searchField = new SearchField(driver);
        searchField.enterValueForSearch();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement findButton = driver.findElement(By.cssSelector(".header-search__submit"));
        findButton.click();
        WebElement resultMessage = driver.findElement(By.cssSelector("div.search-results__exception-message:nth-child(5)"));
        Assert.assertTrue(resultMessage.isDisplayed());


    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }


}



