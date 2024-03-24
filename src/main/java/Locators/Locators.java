package Locators;

import org.openqa.selenium.By;

public interface Locators {
    public interface MainPage {
        By currentDate = By.xpath("//div[@class='current-time']");
        By nextPage = By.xpath("//a[@class='subnav-menu-item'][2]");
    };
    public interface TomorrowPage {
        By dayDate = By.xpath("//div[@class='date date-3']");
    };
}
