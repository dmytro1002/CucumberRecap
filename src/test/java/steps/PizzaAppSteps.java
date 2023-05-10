package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PizzaAppSteps {

    @Given("user navigates to {string} application")
    public void user_navigates_to_application(String string) {

    }


    @When("user creates pizza order with data")
    public void user_creates_pizza_order_with_data(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>.
    }
    @Then("user validates that order is created with message {string}")
    public void user_validates_that_order_is_created_with_message(String string) {

    }
}
