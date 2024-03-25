import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PiterGSMTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        driver.manage().window().maximize();
        Duration implicitWait = Duration.ofSeconds(15);
        driver.get("https://pitergsm.ru/");
        WebElement buttonContinue = (new WebDriverWait(driver, implicitWait))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='city-popup__top']")));
        String city = driver.findElement(By.xpath("//div[@class='city-popup__top']")).getText();
        Assert.assertEquals("��� �����: �����-���������",city);
        WebElement button = driver.findElement(By.xpath("//a[@class='sh-nav__link icon-user-white js-show-popup']"));
        button.click();
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("aboba");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("givemeyourpassword");
        WebElement enter = driver.findElement(By.xpath("//input[@name='Login']"));
        enter.click();
        String errorMessage = driver.findElement(By.xpath("//font[@class='errortext']")).getText();
        Assert.assertEquals("�������� ����� ��� ������.", errorMessage);
    }

    @After
    public void close() {
        driver.close();
    }
}
