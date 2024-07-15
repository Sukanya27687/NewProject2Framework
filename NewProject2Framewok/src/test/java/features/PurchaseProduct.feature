@SmokeTest
Feature: As a user of swag labs
  I must be able to add the selected product to Cart
  and must be able to purchase the selected product.

  Background: Navigate
    Given the user navigates to home page
    When the user login with "standard_user" username and "secret_sauce" password
    Then the user should see the "Products"

  Scenario: 1.
    When the user selects the product  "Sauce labs backpack" and clicks on “Add to cart” button
    Then the user clicks in "Cart" icon
    When the user navigates to "Your Cart" page and clicks on "Checkout" button
    Then the user should navigate to Checkout page and the user enters "Sukanya" FirstName,"Yeleti" LastName and "XXXMMM" PostalCode and clicks on Continue button
    Then the user should see Checkout page with payment information and Clicks on "Finish" button
    Then the user should see "Checkout: Complete!" page.

