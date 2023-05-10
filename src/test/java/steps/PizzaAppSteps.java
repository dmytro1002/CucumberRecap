package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.PizzaAppPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Map;

public class PizzaAppSteps {

    WebDriver driver = Driver.getDriver();
    PizzaAppPage pizzaAppPage = new PizzaAppPage();

    @Given("user navigates to {string} application")
    public void user_navigates_to_application(String url) {
        driver.get(ConfigReader.getProperty(url));
    }


    @When("user creates pizza order with data")
    public void user_creates_pizza_order_with_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>.

        Map<String, String> data = dataTable.asMap(String.class,String.class);
        System.out.println(data);

        BrowserUtils.selectDropdownByValue(pizzaAppPage.pizzaDropdown,data.get("Pizza"));
        BrowserUtils.selectDropdownByValue(pizzaAppPage.topping1Dropdown,data.get("Topping1"));
        BrowserUtils.selectDropdownByValue(pizzaAppPage.topping2Dropdown,data.get("Topping2"));
        pizzaAppPage.pizzaQtyBox.sendKeys(Keys.BACK_SPACE+data.get("Quantity"));
        pizzaAppPage.nameBox.sendKeys(data.get("Name"));
        pizzaAppPage.emailBox.sendKeys(data.get("Email"));
        pizzaAppPage.phoneBox.sendKeys(data.get("Phone"));
        if (data.get("Payment").equals("Cash on Pickup")){
            pizzaAppPage.cashRadioButton.click();
        }else {
            pizzaAppPage.creditCardRadioButton.click();
        }
        pizzaAppPage.placeOrderButton.click();
    }

    @Then("user validates that order is created with message {string}")
    public void user_validates_that_order_is_created_with_message(String string) {

    }
}
