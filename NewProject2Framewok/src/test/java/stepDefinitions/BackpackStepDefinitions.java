package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BackpackPageObjects;

public class BackpackStepDefinitions extends WebConnector {
    BackpackPageObjects backpackPageObjects= new BackpackPageObjects();

    @When("the user selects {string} product from the list of products")
    public void the_user_selects_product_from_the_list_of_products(String string) throws InterruptedException {
 backpackPageObjects.clickBackpackOption(string);
 Thread.sleep(3000);
    }
    @Then("the user must be able to {string} to the cart")
    public void the_user_must_be_able_to_to_the_cart(String string) throws InterruptedException {
backpackPageObjects.AddtocartButton(string);
Thread.sleep(3000);
    }

    @Then("the user must be able to view the product in the cart")
    public void the_user_must_be_able_to_view_the_product_in_the_cart(String option) {
backpackPageObjects.clickshoppingCartIcon();
    }
}
