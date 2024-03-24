import Locators.Locators;
import Pages.MainPage;
import Pages.TomorrowPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gismeteo {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        driver.manage().window().maximize();
        driver.get("https://www.gismeteo.ru/");
        String date1 = MainPage.getCurrentDate();
        WebElement nextPageBut = driver.findElement(Locators.MainPage.nextPage);
        nextPageBut.click();
        String date2 = TomorrowPage.getTomorrowPageDate();
        Assert.assertEquals(date1, date2);
    }

    @After
    public void close() {
        driver.close();
    }
}
