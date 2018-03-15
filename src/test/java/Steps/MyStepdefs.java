package Steps;

import PageObjects.GoogleSearchPage;
import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by adennis on 3/12/2018.
 */

public class MyStepdefs{

    public WebDriver driver;
    public GoogleSearchPage google = new GoogleSearchPage(driver);

    public MyStepdefs () {
      driver = Hooks.driver;
      PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigateTo(String url){
      driver.navigate().to(url);
    }

    @And("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String url)
    {
        google.searchFor(url);
    }

    @And("^I press enter in the search field$")
    public void iPressEnterInTheSearchField()
    {
        google.enter();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String linkName)
    {
        google.clickLink(linkName);
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void iShouldBeOnThePage(String expectedTitle)
    {
        String title = driver.getTitle();
        assertEquals(expectedTitle,title);
    }


    @Given("^I click on the text \"([^\"]*)\"$")
    public void iClickOnTheText(String text) {
        google.clickOnText(text);
    }
}
