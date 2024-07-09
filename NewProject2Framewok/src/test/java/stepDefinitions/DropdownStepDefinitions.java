package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownPageObjects;
import utilities.ConstantUtils;

public class DropdownStepDefinitions extends WebConnector {
    DropdownPageObjects dropdownPageObjects = new DropdownPageObjects();

  // @Given("the user navigates to home page")
     public void the_user_navigate_to_home_page() {
     //  driver.get(ConstantUtils.BASE_URL);
    }

    @Then("the user must see the {int} options in the dropdown box")
    public void the_user_must_see_the_options_in_the_dropdown_box(int count) {
         dropdownPageObjects.checkNumberOfOptions(count);
    }
    @When("the user select {string} option from the dropdown")
    public void the_user_select_option_from_the_dropdown(String dropdown) {
        dropdownPageObjects.selectOptionFromDropdown(dropdown);
        //Thread.sleep(3000);
    }
    @Then("the user should see {string} option is selected in the dropdown")
    public void the_user_should_see_option_is_selected_in_the_dropdown(String selectdropdown){
        dropdownPageObjects.checkSelectedOption(selectdropdown);
       // Thread.sleep(3000);
    }
}
