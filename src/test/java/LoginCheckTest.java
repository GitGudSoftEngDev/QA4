import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginCheckTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        Duration implicitWait = Duration.ofSeconds(5); // ��������, 5 ������
        driver.manage().window().maximize();
        driver.get("https://www.vk.com");
        WebElement username = driver.findElement(By.id("index_email"));
        username.sendKeys("aboba@gmail.com");
        WebElement button = driver.findElement(By.xpath("//button[@class='FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton']"));
        button.click();
        WebElement buttonContinue = (new WebDriverWait(driver, implicitWait))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"vkc__DefaultSkin__button\"]")));
        buttonContinue.click();
    }

    @After
    public void close() {
        driver.close();
    }
}