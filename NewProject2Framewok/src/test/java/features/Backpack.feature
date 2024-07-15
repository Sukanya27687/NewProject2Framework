Feature: Verify adding Sauce Labs backpack product to cart
As a user of the system
I should be able to login with valid credentials
so that I can add sauce labs backpack product to the cart


Background: Navigate
Given the user navigates to home page

#@SmokeTest
 Scenario: 1. Verify login with Valid credentials
   When the user login with "standard_user" username and "secret_sauce" password
   Then the user should see "Products"
    When the user selects "Sauce labs backpack" product from the list of products
    Then the user must be able to "add product" to the cart
    Then the user must be able to view the product in the cart