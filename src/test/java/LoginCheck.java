import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginCheck {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        driver.manage().window().maximize();
        driver.get("https://www.vk.com");
        WebElement username = driver.findElement(By.id("index_email"));
        username.sendKeys("aboba@gmail.com");
        WebElement button = driver.findElement(By.xpath("//button[@class='FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton']"));
        button.click();
        WebElement buttonContinue = driver.findElement(By.xpath("//span[@class='vkuiButton__content vkuiText vkuiText--sizeY-compact vkuiText--w-2']"));
        buttonContinue.click();
    }

    @After
    public void close() {
        driver.close();
    }
}