package pageObjects;

import BrowserControl.WebConnector;
import org.openqa.selenium.WebElement;

public class BackpackPageObjects extends WebConnector {
    /*****locators*****/
    public String BackpackXpath =  "//div[@class='inventory_item']";
    public String AddtocartXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
    public String ShoppingCartXpath = "//span[@class='shopping_cart_badge']";


    /**Getters and Setters**/
    public void clickBackpackOption(String option) {
        BasePage.findElementByXpath(10,BackpackXpath).click();
    }

    public void AddtocartButton(String option) {
        BasePage.findElementByXpath(10,AddtocartXpath).click();
    }
    public void clickshoppingCartIcon(){
        BasePage.findElementByXpath(10,ShoppingCartXpath).click();
    }
}
