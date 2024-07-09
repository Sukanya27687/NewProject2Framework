package pageObjects;

import BrowserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPageObjects extends WebConnector {
    /*****LOcators****/
    private String dropdownXpath = "//select[@class='product_sort_container']";
    private String selectedOptionxpath = "//select[@class='select_container']";

    /**Getters and Setter**/
/** method to check the number of options in dropdown box
 * @param expectedCount
 */
public void checkNumberOfOptions(int expectedCount){
    WebElement dropdown= BasePage.findElementByXpath(10,dropdownXpath);
    List<WebElement> options = dropdown.findElements(By.tagName("class"));
    Assert.assertEquals(expectedCount, options.size());
}
/**
 * method to select a given options from the dropdown
 * @param option
 */

public void selectOptionFromDropdown(String option){
    WebElement dropdown= BasePage.findElementByXpath(10, dropdownXpath);
    Select select = new Select(dropdown);
    select.selectByVisibleText(option);
}
public void checkSelectedOption(String expectedOption){
    String actualOption= BasePage.findElementByXpath(10, selectedOptionxpath).getText();
    Assert.assertEquals(expectedOption,actualOption);
}
}
