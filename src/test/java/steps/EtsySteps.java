package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.Driver;

public class EtsySteps {

    WebDriver driver = Driver.getDriver();
    String actualTitle;

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(ConfigReader.getProperty(url));
    }

    @When("user gets the title")
    public void user_gets_the_title() {
        actualTitle  = driver.getTitle();
        System.out.println("My actual title: "+actualTitle);
    }

    @Then("user validates expected title vs actual")
    public void user_validates_expected_title_vs_actual() {
        String expectedTitle  = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
