package BrowserControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.ConstantUtils;


import java.util.concurrent.TimeUnit;

public class WebConnector {
    public static WebDriver driver;
    public static void openBrowser(){
        if(ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")){
            FirefoxOptions fo= new FirefoxOptions();
            fo.addArguments("start-maximized");
            driver = new FirefoxDriver(fo);
        } else {
            ChromeOptions co= new ChromeOptions();
            co.addArguments("start-maximized");
            driver = new ChromeDriver(co);
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public static void closeBrowser(){
        driver.quit();
    }
}
