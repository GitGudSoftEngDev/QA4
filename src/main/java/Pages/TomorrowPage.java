package Pages;

import Locators.Locators;
import org.openqa.selenium.WebDriver;

public class TomorrowPage {
    private static WebDriver browser;

    public TomorrowPage(WebDriver browser){
        this.browser = browser;
    }

    public static String getTomorrowPageDate(){
        return browser.findElement(Locators.TomorrowPage.dayDate).getText();
    }
}
