package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;

/**
 * Created by adennis on 3/13/2018.
 */
public class GoogleSearchPage extends BaseClass {
    public GoogleSearchPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how = How.ID, using="lst-ib")
    public static WebElement search;

    @FindBy(how = How.ID, using="q")
    public static WebElement searchSogeti;

    @FindBy(how = How.CLASS_NAME, using="navbar-search")
    public static WebElement revealNavBar;

    public void searchFor(String value)
    {
        search.sendKeys(value);
    }
    public void clickLink(String value)
    {
        driver.findElement(By.linkText(value)).click();
    }
    public void enter()
    {
        search.sendKeys((Keys.ENTER));
    }

    public void SogetiSearch(String  value)
    {
        revealNavBar.click();
        searchSogeti.sendKeys(value);
        searchSogeti.sendKeys(Keys.ENTER);

    }


}
