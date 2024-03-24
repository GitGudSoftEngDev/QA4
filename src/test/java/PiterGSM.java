import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PiterGSM {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        driver.manage().window().maximize();
        driver.get("https://pitergsm.ru/");
        String city = driver.findElement(By.xpath("//div[@class='city-popup__top']")).getText();
        Assert.assertEquals("Ваш город: Санкт-Петербург",city);
        WebElement button = driver.findElement(By.xpath("//a[@class='sh-nav__link icon-user-white js-show-popup']"));
        button.click();
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("aboba");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("givemeyourpassword");
        WebElement enter = driver.findElement(By.xpath("//input[@name='Login']"));
        enter.click();
        String errorMessage = driver.findElement(By.xpath("//font[@class='errortext']")).getText();
        Assert.assertEquals("Неверный логин или пароль.", errorMessage);
    }

    @After
    public void close() {
        driver.close();
    }
}
