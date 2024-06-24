package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPageObjects;
import utilities.ConstantUtils;

public class LoginStepDefinitions extends WebConnector {
    LoginPageObjects loginpage= new LoginPageObjects();

    @Given("the user navigates to home page")
    public void the_user_navigates_to_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

   @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {
        loginpage.setUserName(username);
        loginpage.setPassword(password);
        loginpage.clickLoginButton();
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

        @Then("the user clicks on logout button")
    public void the_user_clicks_on_logout_button() {
        loginpage.clickLogoutButton();
    }

}
