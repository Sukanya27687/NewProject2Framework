package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.PurchaseProductPageObjects;

public class PurchaseProductStepDefinition extends WebConnector {
    PurchaseProductPageObjects purchaseProductPageObjects = new PurchaseProductPageObjects();

    @Then("the user should see the {string}")
    public void the_user_should_see_the(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }
    @When("the user selects the product  {string} and clicks on “Add to cart” button")
    public void the_user_selects_the_product_and_clicks_on_add_to_cart_button(String string) throws InterruptedException {
        purchaseProductPageObjects.clickBackpackOption(string);
        purchaseProductPageObjects.AddtocartButton();
        Thread.sleep(3000);
    }
    @Then("the user clicks in {string} icon")
    public void the_user_clicks_in_icon(String string) throws InterruptedException {
        purchaseProductPageObjects.clickShoppingCart();
        Thread.sleep(3000);
    }
    @When("the user navigates to {string} page and clicks on {string} button")
    public void the_user_navigates_to_page_and_clicks_on_button(String string, String string2) throws InterruptedException {
        purchaseProductPageObjects.clickCheckoutButton();
        Thread.sleep(3000);
    }
    @Then("the user should navigate to Checkout page and the user enters {string} FirstName,{string} LastName and {string} PostalCode and clicks on Continue button")
    public void the_user_should_navigate_to_Checkout_page_and_the_user_enters_FirstName_LastName_and_PostalCode_and_clicks_on_Continue_button(String firstName, String lastName, String postalCode) throws InterruptedException {
    purchaseProductPageObjects.setFirstName(firstName);
    purchaseProductPageObjects.setLastName(lastName);
    purchaseProductPageObjects.setPostalCode(postalCode);
    purchaseProductPageObjects.clickContinueButton();
    Thread.sleep(3000);
    }
    @Then("the user should see Checkout page with payment information and Clicks on Finish button")
    public void the_user_should_see_Checkout_page_with_payment_information_and_Clicks_on_Finish_button() {
    purchaseProductPageObjects.clickFinishButton();
    }
    @Then("the user should see {string} page.")
    public void the_user_should_see_page(String expectedText) {
Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

}
