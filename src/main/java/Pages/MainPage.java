package Pages;

import Locators.Locators;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private static WebDriver browser;

    public MainPage(WebDriver browser){
        this.browser = browser;
    }

    public static String getCurrentDate(){

        return browser.findElement(Locators.MainPage.currentDate).getText();
    }
}
