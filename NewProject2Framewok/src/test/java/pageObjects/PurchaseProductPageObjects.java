package pageObjects;

import BrowserControl.WebConnector;

public class PurchaseProductPageObjects extends WebConnector {
    /*****Locators*****/
     public String BackpackXpath =  "//div[@class='inventory_item']";
     public String AddtocartXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
     public String ShoppingCartXpath = "//span[@class='shopping_cart_badge']";
     public String CheckoutXpath = "//button[@id='checkout']";
     public String FirstNameXpath = "//input[@id='first-name']";
     public String LastNameXpath = "//input[@id='last-name']";
     public String PostalCodeXpath = "//input[@id='postal-code']";
     public String ContinueXpath = "//input[@id='continue']";
     public String FinishXpath = "//button[@id='finish']";


    /*****Getters and Setters*****/
    public void clickBackpackOption(String option) {
        BasePage.findElementByXpath(10,BackpackXpath).click();
    }
    public void AddtocartButton() {
        BasePage.findElementByXpath(10,AddtocartXpath).click();
    }
 public void clickShoppingCart(){
        BasePage.findElementByXpath(10, ShoppingCartXpath).click();
 }
 public void clickCheckoutButton(){
        BasePage.findElementByXpath(10, CheckoutXpath).click();
 }
 public void setFirstName(String firstName){
        BasePage.findElementByXpath(10, FirstNameXpath).clear();
     BasePage.findElementByXpath(10, FirstNameXpath).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        BasePage.findElementByXpath(10, LastNameXpath).clear();
        BasePage.findElementByXpath(10, LastNameXpath).sendKeys(lastName);
    }
    public void setPostalCode(String postalCode){
        BasePage.findElementByXpath(10, PostalCodeXpath).clear();
        BasePage.findElementByXpath(10, PostalCodeXpath).sendKeys(postalCode);
    }
    public void clickContinueButton(){
        BasePage.findElementByXpath(10, ContinueXpath).click();
    }
    public void clickFinishButton(){
        BasePage.findElementByXpath(10, FinishXpath).click();
    }
}
